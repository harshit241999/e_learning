package com.training.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.doa.contactdoa;
import com.training.module.contact;
import com.training.dbutil.dbutil;
public class contactimpl implements contactdoa {
	Connection conn = dbutil.getConnection();

	@Override
	public List<contact> findAll() {
		List<contact> contacts = new ArrayList<contact>();
		String sql = "select * from contact";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				long userid = rs.getLong("userid");
				String name = rs.getString("name");
				String email = rs.getString("email");
				long phone_no = rs.getLong("phone_no");
				String message = rs.getString("message");
				int contact_id=rs.getInt("contact_id");
				contact Contact = new contact(userid, name,email, phone_no,message,contact_id);
				System.out.println(userid+ name+email+ phone_no+message+contact_id);
				contacts.add(Contact);
			}
			return contacts;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addContact(contact Contact) {

		String query = "insert into contact values(?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setLong(1, Contact.getUserid());
			ps.setString(2, Contact.getName());
			ps.setString(3, Contact.getEmail());
			ps.setLong(4, Contact.getPhone_no());		
			ps.setString(5, Contact.getMessage());
			ps.setInt(6, Contact.getContact_id());
	
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public contact getUserById(Long id) {

		return null;
	}

	@Override
	public boolean deleteUser(Long id) 
	{

		String q = "delete from contact where userid=?";
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
	public boolean updateUser(contact Contact) {

		return false;
	}
}
