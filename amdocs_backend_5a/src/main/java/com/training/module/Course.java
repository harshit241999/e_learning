package com.training.module;

public class Course {
	private Long courseid;
	private String cname;
	private String cdesp;
	private Long cfees;
	private String cresource;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(Long courseid, String cname, String cdesp, Long cfees, String cresource) {
		super();
		this.courseid = courseid;
		this.cname = cname;
		this.cdesp = cdesp;
		this.cfees = cfees;
		this.cresource = cresource;
	}
	public Long getCourseid() {
		return courseid;
	}
	public void setCourseid(Long courseid) {
		this.courseid = courseid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdesp() {
		return cdesp;
	}
	public void setCdesp(String cdesp) {
		this.cdesp = cdesp;
	}
	public Long getCfees() {
		return cfees;
	}
	public void setCfees(Long cfees) {
		this.cfees = cfees;
	}
	public String getCresource() {
		return cresource;
	}
	public void setCresource(String cresource) {
		this.cresource = cresource;
	}
	
	
	
	
	

}
