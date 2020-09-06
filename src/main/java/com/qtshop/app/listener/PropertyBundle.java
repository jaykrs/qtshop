package com.qtshop.app.listener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.qtshop.app.entity.LookUp;
import com.qtshop.app.entity.LookUpType;


@Repository
public class PropertyBundle {

//	public static Map <String, Map <String, Map <String, String>>> systemMap = new HashMap<>();
	public static Map<String, List<LookUp>> systemMap = new HashMap<String, List<LookUp>>();
	
	public static Map<String, List<LookUp>> adminSystemMap = new HashMap<String, List<LookUp>>();

	@PersistenceContext
	EntityManagerFactory entityManagerFactory;

	@Autowired
	MongoTemplate mongoTemplate;
	
	@EventListener(ApplicationReadyEvent.class)
	public void initilizeProperty() {
		
		List<LookUpType> lookupTypeList = mongoTemplate.findAll(LookUpType.class);

		System.out.println(lookupTypeList.size());
		for (LookUpType lut : lookupTypeList) {
			Query query = new Query();
			query.addCriteria(Criteria.where("lookUpTypeId").is(lut.getLookUpTypeId()));
			List<LookUp> lookupList = mongoTemplate.find(query, LookUp.class);
//			List<LookUp> lookupList = entityManager.createNamedQuery("LookUp.findAllByLookUpType", LookUp.class)
//					.setParameter("lookUpTypeId", lut.getLookUpTypeId()).getResultList();
			PropertyBundle.systemMap.put(lut.getLookUpTypeName(), lookupList);
		}
		/*
		 * for (LookUpType lut : lookupTypeList) { List<LookUp> lookupList =
		 * entityManager.createNamedQuery("LookUp.findAllByLookUpTypeForAdmin",
		 * LookUp.class) .setParameter("lookUpTypeId",
		 * lut.getLookUpTypeId()).getResultList();
		 * PropertyBundle.adminSystemMap.put(lut.getLookUpTypeName(), lookupList); }
		 */
		
		System.out.println(PropertyBundle.systemMap);
	}

}
