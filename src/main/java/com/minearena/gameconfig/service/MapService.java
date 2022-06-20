package com.minearena.gameconfig.service;

import com.minearena.gameconfig.entity.data.Map;

import java.util.List;

public interface MapService {
    List<Map> findAll();
    Map insertMap(Map map);
}
