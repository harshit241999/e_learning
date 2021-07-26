package com.training.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.doa.feeddoa;
import com.training.module.feedback;
import com.training.dbutil.dbutil;
public class feedbackimpl implements feeddoa {
	Connection conn = dbutil.getConnection();

	@Override
	public List<feedback> findAll() {
		List<feedback> feedbacks = new ArrayList<feedback>();
		String sql = "select * from feedback";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				long userid = rs.getLong("userid");
				String name = rs.getString("name");
				String email = rs.getString("email");
				long f_id = rs.getLong("f_id");	
				String feedbbacck = rs.getString("feedbbacck");
				feedback Feedback = new feedback(userid, name,email,f_id,feedbbacck);
				System.out.println(userid+ name+email+f_id+feedbbacck);
				feedbacks.add(Feedback);
			}
			return feedbacks;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addfeedback(feedback Feedback) {

		String query = "insert into feedback values(?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setLong(1, Feedback.getUserid());
			ps.setString(2, Feedback.getName());
			ps.setString(3,Feedback.getEmail() );
	
			ps.setLong(4, Feedback.getF_id());
			
			ps.setString(5, Feedback.getFeedbbacck());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public feedback getUserById(Long id) {

		return null;
	}

	@Override
	public boolean deletefeedback(Long id) 
	{

		String q = "delete from feedback where User_id=?";
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
	public boolean updatefeedback(feedback Feddback) {

		return false;
	}
}
