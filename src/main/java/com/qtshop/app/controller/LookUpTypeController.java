package com.qtshop.app.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qtshop.app.entity.LookUp;
import com.qtshop.app.entity.LookUpType;
import com.qtshop.app.repository.LookUpTypeRepository;

@RestController
@CrossOrigin
@RequestMapping("/lookuptype")
public class LookUpTypeController {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	private LookUpTypeRepository lRepository;
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public ResponseEntity<List<LookUpType>> getAllLookUpType() {
		LOG.info("Getting all LookupType.");
		return new ResponseEntity<List<LookUpType>>(lRepository.findAll(),HttpStatus.OK);
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
