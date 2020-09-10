package com.qtshop.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.qtshop.app.entity.Users;
import com.qtshop.app.factory.IUserService;

@Service
public class UserRepositoryService implements IUserService {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public Users getUserByEmail(String emailId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("emailId").is(emailId));
		return mongoTemplate.findOne(query, Users.class);
	}

}
