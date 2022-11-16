package com.macalsandair.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository("fake")
public class PostgresApplicationUserExtractor {
	

	private final PasswordEncoder passwordEncoder;

	@Autowired
	public PostgresApplicationUserExtractor(PasswordEncoder passwordEncoder) {
		super();
		this.passwordEncoder = passwordEncoder;
	}
	
	
}
