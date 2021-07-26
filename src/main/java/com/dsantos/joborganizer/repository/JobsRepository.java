package com.dsantos.joborganizer.repository;

import com.dsantos.joborganizer.model.Jobs;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface JobsRepository extends MongoRepository<Jobs, String> {

}