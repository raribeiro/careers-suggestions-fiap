package br.com.carraria.careersuggestions.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table (name="T_CSU_INTEREST")
public class Interest implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="interest", sequenceName = "sq_interest", allocationSize=1 )
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name="cd_interest")
	private long id;
	@Column (name="date_interest")
	@Temporal(TemporalType.DATE)
	private LocalDate dateInterest = LocalDate.now();
	@Column (name="isLiked")
	private int isLiked;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	@ManyToOne(fetch = FetchType.LAZY)
	private Content content;
	
	
	
	public Interest() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getDateInterest() {
		return dateInterest;
	}
	public void setDateInterest(LocalDate dateInterest) {
		this.dateInterest = dateInterest;
	}
	public int getIsLiked() {
		return isLiked;
	}
	public void setIsLiked(int isLiked) {
		this.isLiked = isLiked;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Interest(long id, LocalDate dateInterest, int isLiked, User user, Content content) {
		super();
		this.id = id;
		this.dateInterest = dateInterest;
		this.isLiked = isLiked;
		this.user = user;
		this.content = content;
	}
	@Override
	public String toString() {
		return "Interest [id=" + id + ", dateInterest=" + dateInterest + ", isLiked=" + isLiked + ", user=" + user
				+ ", content=" + content + "]";
	}
	
	
	
	
}
