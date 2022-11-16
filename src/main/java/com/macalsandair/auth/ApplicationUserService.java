package com.macalsandair.auth;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class ApplicationUserService implements UserDetailsService {

	private final ApplicationUserExtractor applicationUserExtractor;
	
	public ApplicationUserService(@Qualifier("postgresUserExtractor") ApplicationUserExtractor applicationUserExtractor) {
		super();
		this.applicationUserExtractor = applicationUserExtractor;
	}



	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return applicationUserExtractor.selectApplicationUserByUsername(username).orElseThrow(
				() -> new UsernameNotFoundException(String.format("Username %s not found", username)));
	}

}
