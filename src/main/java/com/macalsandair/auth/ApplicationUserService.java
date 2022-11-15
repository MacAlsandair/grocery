package com.macalsandair.auth;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class ApplicationUserService implements UserDetailsService {

	private final ApplicationUserDao applicationUserDao;
	
	public ApplicationUserService(@Qualifier("postgresUserDao") ApplicationUserDao applicationUserDao) {
		super();
		this.applicationUserDao = applicationUserDao;
	}



	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return applicationUserDao.selectApplicationUserByUsername(username).orElseThrow(
				() -> new UsernameNotFoundException(String.format("Username %s not found", username)));
	}

}
