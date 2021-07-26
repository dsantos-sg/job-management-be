package com.dsantos.joborganizer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class JobDescription {
    private String jobTitle;
    private String jobCode;
    private String jobLink;
    private int priority;
    private Date publishDate;
    private Date closeDate;
    private String jobDetail;
    private String jobRequirements;
    private String contractType;
    private float salaryOffer;
    private ArrayList benefits;
    private ArrayList tags;
    private String additionalInfos;
}