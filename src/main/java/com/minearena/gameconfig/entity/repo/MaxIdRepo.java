package com.minearena.gameconfig.entity.repo;

import com.minearena.gameconfig.entity.data.MaxId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MaxIdRepo extends MongoRepository<MaxId, String> {
}
