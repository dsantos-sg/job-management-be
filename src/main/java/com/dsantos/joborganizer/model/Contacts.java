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
public class Contacts {
    private String contactFirstName;
    private String contactLastName;
    private String role;
    private ArrayList phone;
    private ArrayList email;
    private String additionalInfos;

}
