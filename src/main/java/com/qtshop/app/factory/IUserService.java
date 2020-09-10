package com.qtshop.app.factory;

import com.qtshop.app.entity.Users;

public interface IUserService {

	public Users getUserByEmail(String emailId);
	
}
