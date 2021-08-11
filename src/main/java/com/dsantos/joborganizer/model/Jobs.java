package com.dsantos.joborganizer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@Setter
@ToString

@Document(collection = "jobs")
public class Jobs {

    @Id
    private String id;
    private JobDescription jobDescription;
    private Company company;
    private ArrayList<Contacts> contacts;
    private Application application;
    private ArrayList<Interview> interviews;
    private FollowUp followUp;

    public Jobs(JobDescription jobDescription,
                Company company,
                ArrayList<Contacts> contacts,
                Application application,
                ArrayList<Interview> interviews,
                FollowUp followUp) {
        this.jobDescription = jobDescription;
        this.company = company;
        this.contacts = contacts;
        this.application = application;
        this.interviews = interviews;
        this.followUp = followUp;
    }
}
