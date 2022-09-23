package br.com.carraria.careersuggestions.controller;


import br.com.carraria.careersuggestions.model.Job;
import br.com.carraria.careersuggestions.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/jobs", produces = MediaType.APPLICATION_JSON_VALUE)
public class JobController {

    @Autowired
    private JobRepository repository;

    @GetMapping
    public List<Job> list(){
        return repository.findAll();
    }
}
