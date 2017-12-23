package mr.iscae.app_Chat.model;

import java.util.Date;

import sun.rmi.runtime.Log;




public class Message {
 
	private long id;
	private String message;
	private Date creatdate;
	private String auther;
	public Message() {
		// TODO Auto-generated constructor stub
	}
	public Message(long id, String message, Date creatdate, String auther) {
		super();
		this.id = id;
		this.message = message;
		this.creatdate = creatdate;
		this.auther = auther;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreatdate() {
		return creatdate;
	}
	public void setCreatdate(Date creatdate) {
		this.creatdate = creatdate;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	
}
