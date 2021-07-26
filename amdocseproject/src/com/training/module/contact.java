package com.training.module;

public class contact {
	private Long userid;
	private String name;
	private String email;
	private Long phone_no;
	private String message;
	private int contact_id;
	
	public contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public contact(Long userid, String name, String email, Long phone_no, String message, int contact_id) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.phone_no = phone_no;
		this.message = message;
		this.contact_id = contact_id;
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
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	
	


}
