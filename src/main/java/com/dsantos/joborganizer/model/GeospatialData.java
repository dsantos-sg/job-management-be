package com.dsantos.joborganizer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class GeospatialData {
    private String type;
    private ArrayList coordinates;


}
