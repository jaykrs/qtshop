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

import com.qtshop.app.entity.LookUpType;
import com.qtshop.app.entity.Users;
import com.qtshop.app.repository.LookUpTypeRepository;
import com.qtshop.app.repository.UsersRepository;

@RestController
@RequestMapping("/lookuptype")
public class LookUpTypeController {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	private LookUpTypeRepository lRepository;
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public List<LookUpType> getAllLookUpType() {
		LOG.info("Getting all LookupType.");
		return lRepository.findAll();
	}
	
	@RequestMapping(value = "/{lookuptypeId}", method = RequestMethod.GET)
	public Optional<LookUpType> getLookUpTYpe(@PathVariable String lookuptype) {
		LOG.info("Getting lookuptype with ID: {}.", lookuptype);
		return lRepository.findById(lookuptype);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public LookUpType addNewLookUpType(@RequestBody LookUpType lookupType) {
		LOG.info("Saving lookupType.");
		return lRepository.insert(lookupType);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public LookUpType updateLookUpType(@RequestBody LookUpType lookupType) {
		LOG.info("Updating lookupType.");
		return lRepository.save(lookupType);
	}

}
