package com.qtshop.app.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.qtshop.app.entity.Users;
import com.qtshop.app.factory.IUserService;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	MongoTemplate mongoTemplate;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Autowired
	IUserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userService.getUserByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		} else {
			return new org.springframework.security.core.userdetails.User(user.getEmailId(), user.getPwd(),
					new ArrayList<>());
		}
	}
	
	public Users save(Users user) {
		user.setPwd(bcryptEncoder.encode(user.getPwd()));
		user.setCreatedAt(new Date());
		return mongoTemplate.save(user);
	}
}