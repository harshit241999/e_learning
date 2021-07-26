package com.training.module;

public class feedback {
	private long userid;
	private String name;
	private String email;
	private long f_id;
	private String feedbbacck;
	
//	public feedback() {
//		super();
		// TODO Auto-generated constructor stub
//	}

	

	public feedback(long userid, String name, String email, long f_id, String feedbbacck) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.f_id = f_id;
		this.feedbbacck = feedbbacck;
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



	public Long getF_id() {
		return f_id;
	}



	public void setF_id(Long f_id) {
		this.f_id = f_id;
	}



	public String getFeedbbacck() {
		return feedbbacck;
	}



	public void setFeedbbacck(String feedbbacck) {
		this.feedbbacck = feedbbacck;
	}

}
