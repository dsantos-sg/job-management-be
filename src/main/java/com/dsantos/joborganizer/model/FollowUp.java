package com.dsantos.joborganizer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class FollowUp {
    private HashMap<String, Boolean> overview;
    private int status;
    private Date companyFeedbackDate;
    private float salaryOffer;
    private float proposedSalary;
    private float difference;
    private int rating;
    private ArrayList<Comments> comments;
}
