package com.minearena.gameconfig.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapObjectItem {
    private int id;
    private int typeId;
    private float[] pos;
}
