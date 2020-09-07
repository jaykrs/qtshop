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
import com.qtshop.app.repository.LookUpRepository;
import com.qtshop.app.repository.LookUpTypeRepository;


@Repository
public class PropertyBundle {

//	public static Map <String, Map <String, Map <String, String>>> systemMap = new HashMap<>();
	public static Map<String, List<LookUp>> systemMap = new HashMap<String, List<LookUp>>();
	
	public static Map<String, List<LookUp>> adminSystemMap = new HashMap<String, List<LookUp>>();

	@Autowired
	LookUpRepository lookUpRepository;

	@Autowired
	MongoTemplate mongoTemplate;
	
	@Autowired
	LookUpTypeRepository lookUpTypeRepository;
	
	@EventListener(ApplicationReadyEvent.class)
	public void initilizeProperty() {
		List<LookUpType> lookupTypeList = mongoTemplate.findAll(LookUpType.class);
		/*
		 * LookUpType lkt = new LookUpType(); lkt.setLookUpTypeName("CUSTOMER_TYPE");
		 * lkt.setLookUpTypeLabel("CUSTOMER TYPE"); mongoTemplate.save(lkt);
		 * 
		 * List<LookUpType> lookupTypeList = mongoTemplate.findAll(LookUpType.class);
		 
		  LookUp lk = new LookUp(); lk.setLookUpName("DEBIT_CARD");
		  lk.setLookUpLabel("DEBIT_CARD"); lk.setActive(Boolean.TRUE);
		  lk.setDeleted(Boolean.FALSE);
		  lk.setLookUpTypeId(lookupTypeList.get(0).getLookUpTypeId());
		  mongoTemplate.save(lk);
		 */
		
//		System.out.println(lookupTypeList.get(2).getLookUpTypeId());
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
