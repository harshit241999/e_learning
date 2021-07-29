package com.training.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.doa.Contactdoa;
import com.training.module.Contact;
import com.training.dbutil.dbutil;
public class Contactimpl implements Contactdoa {
	Connection conn = dbutil.getConnection();

	@Override
	public List<Contact> findAll() {
		List<Contact> contacts = new ArrayList<Contact>();
		String sql = "select * from contact";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				long userid = rs.getLong("userid");
				String name = rs.getString("name");
				String email = rs.getString("email");
				long phoneno = rs.getLong("phoneno");
				String message = rs.getString("message");
				int contactid=rs.getInt("contactid");
				Contact contact = new Contact(userid, name,email, phoneno,message,contactid);
				System.out.println(userid+ name+email+ phoneno+message+contactid);
				contacts.add(contact);
			}
			return contacts;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addContact(Contact contact) {

		String query = "insert into contact values(?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setLong(1, contact.getUserid());
			ps.setString(2, contact.getName());
			ps.setString(3, contact.getEmail());
			ps.setLong(4, contact.getPhoneno());		
			ps.setString(5, contact.getMessage());
			ps.setInt(6, contact.getContactid());
	
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public Contact getUserById(Long id) {
		String query = "select * from contact where userid=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Contact contact = new Contact(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getLong(4),
						rs.getString(5), rs.getInt(6));
				return contact;
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
	public boolean updateUser(Contact contact) {
		String query = "update contact set name=?,email=?,phoneno=?,message=? where userid=?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, contact.getName());
			ps.setString(2, contact.getEmail());

			ps.setLong(3,contact.getPhoneno());
			ps.setString(4, contact.getMessage());
			ps.setLong(5, contact.getUserid());
//			ps.setLong(6, user.getUser_id());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
}
