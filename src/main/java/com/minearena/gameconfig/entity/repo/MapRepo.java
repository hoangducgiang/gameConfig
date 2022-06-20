package com.minearena.gameconfig.entity.repo;

import com.minearena.gameconfig.entity.data.Map;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MapRepo extends MongoRepository<Map, Integer> {
}
