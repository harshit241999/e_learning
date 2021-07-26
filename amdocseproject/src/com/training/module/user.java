package com.training.module;

public class user {
	private Long userid;
	private String name;
	private Long phone_no;
	private String email;
	private String address;
	private String password;
	private String upload_img;
	private String reg_date;
	
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public user(Long userid, String name, Long phone_no, String email,  String address, String password,
			String upload_img,String reg_date) {
		super();
		this.userid = userid;
		this.name = name;
		this.phone_no = phone_no;
		this.email = email;
		this.address = address;
		this.password = password;
		this.upload_img = upload_img;
		this.reg_date = reg_date;
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
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUpload_img() {
		return upload_img;
	}
	public void setUpload_img(String upload_img) {
		this.upload_img = upload_img;
	}
	


}
