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
public class Company {
    private String companyName;
    private String website;
    private ArrayList phone;
    private ArrayList email;
    private GeospatialData geospatialData;
    private float distanceFromHome;
    private String aboutUs;
    private String additionalInfos;

}
