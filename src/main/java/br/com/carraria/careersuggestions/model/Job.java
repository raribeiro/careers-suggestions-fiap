package br.com.carraria.careersuggestions.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "tb_job")
public class Job implements Serializable{
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "sq_job")
    @Column(columnDefinition = "serial")
    private Long id_;
    private String job_name;
    
    @OneToMany(mappedBy = "content", cascade = CascadeType.ALL)
    List<JobContent> jobContent = new ArrayList<JobContent>();
    
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
