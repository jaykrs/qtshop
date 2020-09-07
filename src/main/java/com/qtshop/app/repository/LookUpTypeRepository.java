package com.qtshop.app.repository;

/**
 * @author jayant
 *
 */
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qtshop.app.entity.LookUpType;


@Repository
public interface LookUpTypeRepository extends MongoRepository<LookUpType, String> {
}