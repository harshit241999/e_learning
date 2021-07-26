package com.training.module;

public class course {
	private Long course_id;
	private String c_name;
	private String c_desp;
	private long c_fees;
	private String c_resource;
	
	
	public course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public course(Long course_id, String c_name, String c_desp, Long c_fees, String c_resource) {
		super();
		this.course_id = course_id;
		this.c_name = c_name;
		this.c_desp = c_desp;
		this.c_fees = c_fees;
		this.c_resource = c_resource;
	}



	public Long getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public long getC_fees() {
		return c_fees;
	}
	public void setC_fees(long c_fees) {
		this.c_fees = c_fees;
	}
	public String getC_resource() {
		return c_resource;
	}
	public void setC_resource(String c_resource) {
		this.c_resource = c_resource;
	}


	public String getC_desp() {
		return c_desp;
	}

	public void setC_desp(String c_desp) {
		this.c_desp = c_desp;
	}
	

}
