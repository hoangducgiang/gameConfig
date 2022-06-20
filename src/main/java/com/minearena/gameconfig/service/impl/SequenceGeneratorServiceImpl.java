package com.minearena.gameconfig.service.impl;

import com.minearena.gameconfig.entity.data.MaxId;
import com.minearena.gameconfig.entity.repo.MaxIdRepo;
import com.minearena.gameconfig.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.Objects;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;


@Component
public class SequenceGeneratorServiceImpl implements SequenceGeneratorService {

    @Autowired
    private MaxIdRepo maxIdRepo;

    @Autowired
    private MongoOperations mongoOperations;

    @Override
    public long generateSequence(String id) {
        MaxId counter = mongoOperations.findAndModify(query(where("_id").is(id)),
                new Update().inc("value",1), options().returnNew(true).upsert(true),
                MaxId.class);
        return !Objects.isNull(counter) ? (counter.getValue()) : 1l;
    }
}
