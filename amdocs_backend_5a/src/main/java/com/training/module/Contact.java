package com.training.module;

public class Contact {
	private Long userid;
	private String name;
	private String email;
	private Long phoneno;
	private String message;
	private int contactid;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Long userid, String name, String email, Long phoneno, String message, int contactid) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.message = message;
		this.contactid = contactid;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getContactid() {
		return contactid;
	}
	public void setContactid(int contactid) {
		this.contactid = contactid;
	}
	
	


}
