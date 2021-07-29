package com.training.module;

public class User {
	private Long userid;
	private String name;
	private Long phoneno;
	private String email;
	private String address;
	private String password;
	private String uploadimg;
	private String regdate;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long userid, String name, Long phoneno, String email, String address, String password, String uploadimg,
			String regdate) {
		super();
		this.userid = userid;
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
		this.address = address;
		this.password = password;
		this.uploadimg = uploadimg;
		this.regdate = regdate;
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

	public Long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getUploadimg() {
		return uploadimg;
	}

	public void setUploadimg(String uploadimg) {
		this.uploadimg = uploadimg;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	
	


}
