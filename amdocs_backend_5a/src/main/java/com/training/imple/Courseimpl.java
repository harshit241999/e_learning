package com.training.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.doa.Coursedoa;

import com.training.module.Course;
import com.training.dbutil.dbutil;
public class Courseimpl implements Coursedoa {
	Connection conn = dbutil.getConnection();

	@Override
	public List<Course> findAll() {
		List<Course> courses = new ArrayList<Course>();
		String sql = "select * from course";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				long courseid = rs.getLong("courseid");
				String cname = rs.getString("cname");
				
				String cdesp = rs.getString("cdesp");
				long cfees = rs.getLong("cfees");
				String cresource = rs.getString("cresource");
	
				Course course = new Course(courseid,cname,cdesp,cfees,cresource);
				System.out.println(courseid+cname+cdesp+cfees+cresource);
				courses.add(course);
			}
			return courses;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addcc(Course course) {

		String query = "insert into course values(?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setLong(1, course.getCourseid());
			ps.setString(2, course.getCname());
			ps.setString(3, course.getCdesp());
			ps.setLong(4, course.getCfees());
			ps.setString(5, course.getCresource());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public Course getUserById(Long id) {
		String query = "select * from course where courseid=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Course course = new Course(rs.getLong(1), rs.getString(2),rs.getString(3), rs.getLong(4),rs.getString(5));
				return course;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean deleteUser(Long id) 
	{

		String q = "delete from course where courseid=?";
		try {
			PreparedStatement ps = conn.prepareStatement(q);

			ps.setLong(1, id);
			
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateUser(Course course) {
		String query = "update course set cname=?,cdesp=?,cfees=?,cresource=? where courseid=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, course.getCname());
			ps.setString(2, course.getCdesp());

			ps.setLong(3,course.getCfees());
			ps.setString(4, course.getCresource());
			ps.setLong(5, course.getCourseid());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
}
