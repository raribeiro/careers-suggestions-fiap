package br.com.carraria.careersuggestions.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.SequenceGenerators;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;
@Entity
@Table (name="T_CSU_USER")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name="user", sequenceName = "sq_user", allocationSize=1 )
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cd_user")
	private long id;
	@Column(name="nm_name")
	private String name;
	@Column(name="nm_last_name")
	private String lastName;
	@Column(name="nm_email")
	private String email;
	@Column(name="nm_password")
	private String password;
	@Column(name="dt_register")
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDate dateRegister = LocalDate.now();
	@OneToMany(mappedBy = "user")
	private List<Interest> interest = new ArrayList<Interest>();
	
	public User() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LocalDate getDateRegister() {
		return dateRegister;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public User(long id, String name, String lastName, String email, String password, LocalDate dateRegister) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dateRegister = dateRegister;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", dateRegister=" + dateRegister + "]";
	}
	
	
	
}
