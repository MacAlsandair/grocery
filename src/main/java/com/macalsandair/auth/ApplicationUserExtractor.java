package com.macalsandair.auth;

import java.util.Optional;

public interface ApplicationUserExtractor {

	Optional <ApplicationUser> selectApplicationUserByUsername (String username);
	
}
