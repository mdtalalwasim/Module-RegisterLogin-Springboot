package com.registration.login.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.registration.login.entity.User;
import com.registration.login.repository.UserRepository;

public class CustomUserService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		
		try {
			
		User u = userRepository.findByemail(email);
		
		if (u==null) {
			
			throw new UsernameNotFoundException("No User available");
		}else {
			
			return new CustomUser(u);
		}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	

}
