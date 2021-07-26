package com.training.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.doa.coursedoa;
import com.training.module.course;
import com.training.dbutil.dbutil;
public class courseimpl implements coursedoa {
	Connection conn = dbutil.getConnection();

	@Override
	public List<course> findAll() {
		List<course> Courses = new ArrayList<course>();
		String sql = "select * from course";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				long course_id = rs.getLong("course_id");
				String c_name = rs.getString("c_name");
				
				String c_desp = rs.getString("c_desp");
				long c_fees = rs.getLong("c_fees");
				String c_resource = rs.getString("c_resource");
	
				course Course = new course(course_id,c_name,c_desp,c_fees,c_resource);
				System.out.println(course_id+c_name+c_desp+c_fees+c_resource);
				Courses.add(Course);
			}
			return Courses;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addcc(course Course) {

		String query = "insert into course values(?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setLong(1, Course.getCourse_id());
			ps.setString(2, Course.getC_name());
			ps.setString(3, Course.getC_desp());
			ps.setLong(4, Course.getC_fees());
			ps.setString(5, Course.getC_resource());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public course getUserById(Long id) {

		return null;
	}

	@Override
	public boolean deleteUser(Long id) 
	{

		String q = "delete from course where course_id=?";
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
	public boolean updateUser(course Course) {

		return false;
	}
}
