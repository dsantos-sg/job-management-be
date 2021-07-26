package com.dsantos.joborganizer.controller;

import com.dsantos.joborganizer.model.Jobs;
import com.dsantos.joborganizer.repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class JobsRestController {

    @Autowired
    JobsRepository jobsRepository;

    //GET ALL RECORDS
    @GetMapping("/jobs")
    public ResponseEntity<List<Jobs>> getAllJobs() {
        try {
            List<Jobs> jobs = new ArrayList<Jobs>();
            jobsRepository.findAll().forEach(jobs::add);
            if (jobs.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(jobs, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //GET RECORD BY ID
    @GetMapping("/jobs/{id}")
    public ResponseEntity<Jobs> getJobDescriptionById(@PathVariable("id") String id) {
        Optional<Jobs> jobDescriptionData = jobsRepository.findById(id);

        if (jobDescriptionData.isPresent()) {
            return new ResponseEntity<>(jobDescriptionData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

//POST NEW RECORD
    @PostMapping("/jobs")
    public ResponseEntity<Jobs> createJobDescription(@RequestBody Jobs jobs) {
        try {
            Jobs _jobs;
            _jobs = jobsRepository.save(new Jobs(jobs.getJobDescription(), jobs.getCompany(), jobs.getContacts(), jobs.getApplication(), jobs.getInterviews(), jobs.getFollowUp()));
            return new ResponseEntity<>(_jobs, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//UPDATE EXISTING RECORD BY ID
    @PutMapping("/jobs/{id}")
    public ResponseEntity<Jobs> updateJobDescription(@PathVariable("id") String id, @RequestBody Jobs jobDescription) {
        Optional<Jobs> jobsData = jobsRepository.findById(id);

        if (jobsData.isPresent()) {
            Jobs _jobs = jobsData.get();
            _jobs.setJobDescription(_jobs.getJobDescription());
            _jobs.setCompany(_jobs.getCompany());
            _jobs.setContacts(_jobs.getContacts());
            _jobs.setApplication(_jobs.getApplication());
            _jobs.setInterviews(_jobs.getInterviews());
            _jobs.setFollowUp(_jobs.getFollowUp());
            return new ResponseEntity<>(jobsRepository.save(_jobs), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
//
//    //DELETE RECORD BY ID
    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<HttpStatus> deleteJobs(@PathVariable("id") String id) {
        try {
            jobsRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //DELETE ALL RECORDS
    @DeleteMapping("/jobs")
    public ResponseEntity<HttpStatus> deleteAllTutorials() {
        try {
            jobsRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
