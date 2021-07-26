package com.training.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.doa.userdoa;
import com.training.module.user;
import com.training.dbutil.dbutil;
public class userimpl implements userdoa {
	Connection conn = dbutil.getConnection();

	@Override
	public List<user> findAll() {
		List<user> users = new ArrayList<user>();
		String sql = "select * from usertable";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				long userid = rs.getLong("userid");
				String name = rs.getString("name");
				long phone_no = rs.getLong("phone_no");
				String email = rs.getString("email");
				
				String address = rs.getString("address");
				String password = rs.getString("password");
				String upload_image = rs.getString("upload_image");
				String reg_date = rs.getString("reg_date");
				
				user User = new user(userid, name,phone_no,email, address,password,upload_image,reg_date);
				System.out.println(userid+" "+name+" "+phone_no+email+" "+ address+" "+password+" "+upload_image+" "+reg_date);
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
	public boolean addUser(user User) {

		String query = "insert into usertable values(?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setLong(1, User.getUserid());
			ps.setString(2, User.getName());
			ps.setLong(3, User.getPhone_no());
	
			ps.setString(4, User.getEmail());
			
			ps.setString(5, User.getAddress());
			ps.setString(6, User.getPassword());
			ps.setString(7,User.getUpload_img());
			ps.setString(8,User.getReg_date());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public user getUserById(Long id) {

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
	public boolean updateUser(user User) {

		return false;
	}
}
