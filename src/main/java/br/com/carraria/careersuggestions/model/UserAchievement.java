package br.com.carraria.careersuggestions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_CSU_USER_ACHIEVEMENT")
public class UserAchievement {
	@Id
	@Column(name= "cd_user_achievemet")
	private long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	@ManyToOne(fetch = FetchType.LAZY)
	private Achievement achievement;
}
