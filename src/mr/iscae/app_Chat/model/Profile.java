package mr.iscae.app_Chat.model;

import java.util.Date;

public class Profile {

	private long id;
	private String proFileNom;
	private String nom;
	private String email;
	private Date creatdate;
	public Profile() {
		// TODO Auto-generated constructor stub
	}
	public Profile(long id, String proFileNom, String nom, String email) {
		super();
		this.id = id;
		this.proFileNom = proFileNom;
		this.nom = nom;
		this.email = email;
		this.creatdate = new Date();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProFileNom() {
		return proFileNom;
	}
	public void setProFileNom(String proFileNom) {
		this.proFileNom = proFileNom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreatdate() {
		return creatdate;
	}
	public void setCreatdate(Date creatdate) {
		this.creatdate = creatdate;
	} 
	
}
