package br.com.carraria.careersuggestions.controller;


import br.com.carraria.careersuggestions.model.Job;
import br.com.carraria.careersuggestions.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/jobs", produces = MediaType.APPLICATION_JSON_VALUE)
public class JobController {

    @Autowired
    private JobRepository repository;

    @GetMapping
    public List<Job> list(){
        return repository.findAll();
    }

    @GetMapping("/{jobId}")
    public ResponseEntity<Job> search(@PathVariable Long jobId){
        Optional<Job> jobs = repository.findById(jobId);

        if(jobs.isPresent()){
            return ResponseEntity.ok(jobs.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }


}
