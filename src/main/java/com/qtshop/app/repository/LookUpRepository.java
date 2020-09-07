package com.qtshop.app.repository;

/**
 * @author jayant
 *
 */
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qtshop.app.entity.LookUp;


@Repository
public interface LookUpRepository extends MongoRepository<LookUp, String> {
}