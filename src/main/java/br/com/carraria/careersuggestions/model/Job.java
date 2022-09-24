package br.com.carraria.careersuggestions.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_job")
public class Job {

    @Id
    @GeneratedValue(generator = "sq_job")
    @Column(columnDefinition = "serial")
    private Long id_;


    private String job_name;


    public Long getId_() {
        return id_;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setId_(Long id_) {
        this.id_ = id_;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }
}
