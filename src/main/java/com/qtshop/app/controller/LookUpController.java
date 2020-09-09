package com.qtshop.app.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qtshop.app.entity.LookUp;
import com.qtshop.app.repository.LookUpRepository;

@RestController
@RequestMapping("/lookup")
public class LookUpController {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	private LookUpRepository lRepository;
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public List<LookUp> getAllLookUp() {
		LOG.info("Getting all lookup.");
		return lRepository.findAll();
	}
	
	@RequestMapping(value = "/{lookupId}", method = RequestMethod.GET)
	public Optional<LookUp> getLookUpTYpe(@PathVariable String lookupId) {
		LOG.info("Getting lookuptype with ID: {}.", lookupId);
		return lRepository.findById(lookupId);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public LookUp addNewLookUp(@RequestBody LookUp lookup) {
		LOG.info("Saving lookup.");
		return lRepository.insert(lookup);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public LookUp updateLookUp(@RequestBody LookUp lookup) {
		LOG.info("Updating lookup.");
		return lRepository.save(lookup);
	}

}
