package com.dsantos.joborganizer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Interview {
    private Boolean scheduled;
    //TODO InterviewQuantity
    private Date interviewDateTime;
    private GeospatialData geospatialData;
    private ArrayList participants;
    private String additionalInfos;

}
