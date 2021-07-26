package com.training.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.doa.admindoa;
import com.training.module.admin;
import com.training.dbutil.dbutil;
public class adminimple implements admindoa {
	Connection conn = dbutil.getConnection();

	@Override
	public List<admin> findAll() {
		List<admin> admins = new ArrayList<admin>();
		String sql = "select * from admin";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				long admin_id = rs.getLong("admin_id");
				String name = rs.getString("name");	
				String email = rs.getString("email");
				String password = rs.getString("pas1sword");
	
				admin Admin = new admin(admin_id,name,email,password);
				System.out.println(admin_id+name+email+password);
				admins.add(Admin);
			}
			return admins;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addadmin(admin Admin) {

		String query = "insert into admin values(?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setLong(1, Admin.getAdmin_id());
			ps.setString(2, Admin.getName());
			ps.setString(3, Admin.getEmail());
			ps.setString(4, Admin.getPassword());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public admin getUserById(Long id) {

		return null;
	}

	@Override
	public boolean deleteadmin(Long id) 
	{

		String q = "delete from admin where admin_id=?";
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
	public boolean updateUser(admin Admin) {

		return false;
	}
}
