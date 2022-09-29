package br.com.carraria.careersuggestions.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CSU_ARCHIEVEMENT")
public class Achievement implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="achievement", sequenceName = "sq_achievement", allocationSize=1 )
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cd_achievement")
	private long id;
	
	@Column(name="nm_title")
	private String nameTitle;
	@OneToMany(mappedBy = "achievement", cascade = CascadeType.ALL)
	List<UserAchievement> userAchievement = new ArrayList<UserAchievement>();
	

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Achievement other = (Achievement) obj;
		return id == other.id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameTitle() {
		return nameTitle;
	}

	public void setNameTitle(String nameTitle) {
		this.nameTitle = nameTitle;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Achievement(long id, String nameTitle) {
		super();
		this.id = id;
		this.nameTitle = nameTitle;
	}

	public Achievement() {
		super();
		
	}

	@Override
	public String toString() {
		return "Achievement [id=" + id + ", nameTitle=" + nameTitle + "]";
	}
	
	
	
}
