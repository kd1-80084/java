package com.sunbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements AutoCloseable {
	private Connection con;

	public UserDao() {
		try {
			con = DBUtil.getconnection();
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	// add user
	public int addUser(User u1) throws Exception {
		String sql = "insert into users values(default,?,?,?,?,?,false,'voter')";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, u1.getFirst_name());
			stmt.setString(2, u1.getLast_name());
			stmt.setString(3, u1.getEmail());
			stmt.setString(4, u1.getPassword());
			java.sql.Date sdate = new Date(u1.getBirthdate().getTime());
			stmt.setDate(5, sdate);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// find user
	public User findUserByID(int userid) throws Exception {
		String sql = "select * from users where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setInt(1, userid);
			try (ResultSet rs = stmt.executeQuery()) {
				User u = null;
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");
					java.sql.Date sdate = rs.getDate("dob");
					java.util.Date udate = new Date(sdate.getTime());
					Boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					u = new User(id, fname, lname, email, password, udate, status, role);
				}
				return u;
			}

		}
	}

	// updateusername
	public int updateUserName(int id, String fname) throws Exception {
		String sql = "update users set first_name=? where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, fname);
			stmt.setInt(2, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}

	}

	// delete user
	public int deleteUserByID(int id) throws Exception {
		String sql = "delete from users where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// display allUser
	public List<User> displayAllUsers() throws Exception {
		User u = null;
		List<User> list = new ArrayList<>();

		String sql = "select*from users";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");
					java.sql.Date sdate = rs.getDate("dob");
					java.util.Date udate = new Date(sdate.getTime());
					Boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					u = new User(id, fname, lname, email, password, udate, status, role);
					list.add(u);
				}
				return list;
			}

		}
	}

	@Override
	public void close() throws Exception {
		if (con != null)
			con.close();
	}

}
