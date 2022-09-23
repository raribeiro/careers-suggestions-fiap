package br.com.carraria.careersuggestions.repository;

import br.com.carraria.careersuggestions.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

}
