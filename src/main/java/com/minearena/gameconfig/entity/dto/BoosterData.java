package com.minearena.gameconfig.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoosterData {
    private float[] pos;
    private int rota;
    private float cooldown;
    private int[] types;
}
