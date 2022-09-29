package br.com.carraria.careersuggestions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_CSU_JOB_CONTENT")
public class JobContent {
	@Id
	@Column(name="cd_job_content")
	private long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Job job;
	@ManyToOne(fetch = FetchType.LAZY)
	private Content content;
	//TODO: fazer DAOs das classes que tenham  o relacionamento
	// muitos para um, que recebam uma query planejada para não
	// recebermos um LazyInitializationException por causa do Spring
	
	public JobContent() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	public JobContent(long id, Job job, Content content) {
		super();
		this.id = id;
		this.job = job;
		this.content = content;
	}
	@Override
	public String toString() {
		return "JobContent [id=" + id + ", job=" + job + ", content=" + content + "]";
	}
	
	

}
