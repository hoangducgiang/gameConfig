package com.minearena.gameconfig.entity.data;

import com.minearena.gameconfig.entity.dto.BoosterData;
import com.minearena.gameconfig.entity.dto.MapObjectItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("maps")
public class Map {

    @Transient
    public static final String SEQUENCE_NAME = "maps";

    @Id
    private int id;
    private BoosterData[] boosterDocks;
    private float[][] spawnPositions;
    private MapObjectItem[] mapObjectItems;
    private int[][] blocks;
}
