package com.training.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.doa.Admindoa;
import com.training.module.Admin;
import com.training.module.Course;
import com.training.dbutil.dbutil;
public class Adminimple implements Admindoa {
	Connection conn = dbutil.getConnection();

	@Override
	public List<Admin> findAll() {
		List<Admin> admins = new ArrayList<Admin>();
		String sql = "select * from admin";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				long adminid = rs.getLong("adminid");
				String name = rs.getString("name");	
				String email = rs.getString("email");
				String password = rs.getString("password");
	
				Admin admin = new Admin(adminid,name,email,password);
				System.out.println(adminid+name+email+password);
				admins.add(admin);
			}
			return admins;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addadmin(Admin admin) {

		String query = "insert into admin values(?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setLong(1, admin.getAdminid());
			ps.setString(2, admin.getName());
			ps.setString(3, admin.getEmail());
			ps.setString(4, admin.getPassword());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public Admin getUserById(Long id) {
		String query = "select * from admin where adminid=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Admin admin = new Admin(rs.getLong(1), rs.getString(2),rs.getString(3), rs.getString(4));
				return admin;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean deleteadmin(Long id) 
	{

		String q = "delete from admin where adminid=?";
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
	public boolean updateUser(Admin admin) {
		String query = "update admin set name=?,email=?,password=? where adminid=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, admin.getName());
			ps.setString(2, admin.getEmail());

			ps.setString(3,admin.getPassword());
			ps.setLong(4,admin.getAdminid());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
}
