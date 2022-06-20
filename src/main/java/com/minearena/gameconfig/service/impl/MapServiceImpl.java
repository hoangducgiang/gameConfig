package com.minearena.gameconfig.service.impl;

import com.minearena.gameconfig.entity.data.Map;
import com.minearena.gameconfig.entity.repo.MapRepo;
import com.minearena.gameconfig.service.MapService;
import com.minearena.gameconfig.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapServiceImpl implements MapService {

    @Autowired
    private MapRepo mapRepo;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @Override
    public List<Map> findAll() {
        return mapRepo.findAll();
    }

    @Override
    public Map insertMap(Map map) {
        map.setId((int) sequenceGeneratorService.generateSequence(Map.SEQUENCE_NAME));
        return mapRepo.save(map);
    }
}
