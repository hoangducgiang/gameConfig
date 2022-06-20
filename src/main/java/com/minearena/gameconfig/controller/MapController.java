package com.minearena.gameconfig.controller;

import com.minearena.gameconfig.entity.ResponseObject;
import com.minearena.gameconfig.entity.data.Map;
import com.minearena.gameconfig.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "game")
public class MapController {

    @Autowired
    private MapService mapService;

    @GetMapping("getAllMap")
    List<Map> getAllMap() {
        return mapService.findAll();
    }

    @PostMapping("insert/map")
    ResponseEntity<ResponseObject> insertMap(@RequestBody Map map) {
        Map mapResponse = mapService.insertMap(map);
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("ok","hổng có thao", mapResponse)
        );
    }

}
