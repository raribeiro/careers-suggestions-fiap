package br.com.carraria.careersuggestions.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CSU_CONTENT")
public class Content implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name="content", sequenceName = "sq_content", allocationSize=1 )
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cd_content")
	private long id;
	@Column(name="nm_title")
	private String title;
	@Column(name="uri_thumb")
	private String thumb;
	@Column(name="uri_content")
	private String content;
	@OneToMany(mappedBy = "content")
	private List<Interest> interest = new ArrayList<Interest>();
	
	
	public Content() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getThumb() {
		return thumb;
	}


	public void setThumb(String thumb) {
		this.thumb = thumb;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Content(long id, String title, String thumb, String content) {
		super();
		this.id = id;
		this.title = title;
		this.thumb = thumb;
		this.content = content;
	}


	@Override
	public String toString() {
		return "Content [id=" + id + ", title=" + title + ", thumb=" + thumb + ", content=" + content + "]";
	}
	
	
	
}
