package br.com.carraria.careersuggestions.controller;


import br.com.carraria.careersuggestions.model.Job;
import br.com.carraria.careersuggestions.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/{jobId}")
    public ResponseEntity<Job> search(@PathVariable Long jobId){
        Optional<Job> jobs = repository.findById(jobId);

        if(jobs.isPresent()){
            return ResponseEntity.ok(jobs.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Job add(@Validated @RequestBody Job jobs){
        return repository.save(jobs);
    }

    @PutMapping(value = "/{jobId}")
    public ResponseEntity<Job> update(@Validated @PathVariable long jobId, @RequestBody Job jobs){

        if(!repository.existsById(jobId)){
            return ResponseEntity.notFound().build();
        }else{
            jobs.setId_(jobId);
            jobs = repository.save(jobs);
            return ResponseEntity.ok(jobs);
        }

    }

    @DeleteMapping(value = "/{jobId}")
    public  ResponseEntity<Void> delete(@PathVariable long jobId){
        if(!repository.existsById(jobId)){
            return ResponseEntity.notFound().build();
        }else{
            repository.deleteById(jobId);
            return ResponseEntity.noContent().build();
        }
    }

}
