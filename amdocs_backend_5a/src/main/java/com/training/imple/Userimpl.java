package com.training.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.doa.Userdoa;
import com.training.module.User;
import com.training.dbutil.dbutil;
public class Userimpl implements Userdoa {
	Connection conn = dbutil.getConnection();

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		String sql = "select * from usertable";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				long userid = rs.getLong("userid");
				String name = rs.getString("name");
				long phoneno = rs.getLong("phoneno");
				String email = rs.getString("email");
				
				String address = rs.getString("address");
				String password = rs.getString("password");
				String uploadimage = rs.getString("uploadimage");
				String regdate = rs.getString("regdate");
				
				User User = new User(userid, name,phoneno,email, address,password,uploadimage,regdate);
				System.out.println(userid+" "+name+" "+phoneno+email+" "+ address+" "+password+" "+uploadimage+" "+regdate);
				users.add(User);
			}
			return users;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addUser(User user) {

		String query = "insert into usertable values(?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setLong(1, user.getUserid());
			ps.setString(2, user.getName());
			ps.setLong(3, user.getPhoneno());
	
			ps.setString(4, user.getEmail());
			
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getPassword());
			ps.setString(7,user.getUploadimg());
			ps.setString(8,user.getRegdate());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public User getUserById(Long id) {
		String query = "Select * from usertable where userid=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User(rs.getLong(1),	rs.getString(2),rs.getLong(3), rs.getString(4), rs.getString(5),rs.getString(6), rs.getString(7),rs.getString(8));
				return user;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null; 
	}

	@Override
	public boolean deleteUser(Long id) 
	{

		String q = "delete from usertable where userid=?";
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
	public boolean updateUser(User user) {
		String query="update usertable set name=?,phoneno=?,email=?,address=?,password=?,uploadimage=?,regdate=? where userid=?";
		try {
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setLong(2, user.getPhoneno());

			ps.setString(3, user.getEmail());

			ps.setString(4, user.getAddress());
			
			ps.setString(5, user.getPassword());
			ps.setString(6, user.getUploadimg());
			ps.setString(7, user.getRegdate());
			ps.setLong(8, user.getUserid());
		
			ps.executeUpdate();
			return true;
		} catch(SQLException e) {
			e.printStackTrace();
		}



		return false;
	}
}
