package mr.iscae.app_Chat.model;

import java.util.Date;





public class Message {
 
	private long id;
	private String message;
	
	private Date datecreation =new Date();
	private String creatdatetosring;
	private String auther;
	public Message() {
		
		this.creatdatetosring=datecreation.toGMTString();
		//this.creatdate = new Date();
	}
	public Message(long id, String message, String auther) {
		
		this.id = id;
		this.message = message;
		
		this.creatdatetosring=datecreation.toGMTString();
		//this.creatdate = new Date();
		System.out.println(creatdatetosring);
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
	public String getCreatdate() {
		return creatdatetosring;
	}
	public void setCreatdate(String creatdate) {
		this.creatdatetosring = creatdate;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	
}
