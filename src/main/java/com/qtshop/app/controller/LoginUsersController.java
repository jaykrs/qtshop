package com.qtshop.app.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.qtshop.app.entity.Users;
import com.qtshop.app.repository.UsersRepository;

@RestController
@RequestMapping("/user")
public class LoginUsersController {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	private UsersRepository usersRepository;
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public List<Users> getAllUsers() {
		LOG.info("Getting all users.");
		return usersRepository.findAll();
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public Optional<Users> getUser(@PathVariable String userId) {
		LOG.info("Getting user with ID: {}.", userId);
		return usersRepository.findById(userId);
	}
	@PostMapping("/login")
	public ModelAndView showLoginPage(HttpServletRequest request, HttpServletResponse response, Model model) {
        model.addAttribute("message", "Welcome to evanika cms");
        Users result = null;
        if(null != result) {
        	return new ModelAndView("welcomePage");	
        }
        return new ModelAndView("login");
    }
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Users addNewUsers(@RequestBody Users user) {
		LOG.info("Saving user.");
		return usersRepository.save(user);
	}
}
