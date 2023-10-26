package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao implements AutoCloseable {
	private Connection con;

	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void save(Candidate c) throws SQLException {
		Connection con = DbUtil.getConnection();
		String sql = "insert into candidates values(default,?,?,?)";
		// System.out.println(sql);
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, c.getName());
		stmt.setString(2, c.getParty());
		stmt.setInt(3, c.getVotes());
		int count = stmt.executeUpdate();
		System.out.println("rows updated::" + count);
	}

	public void update(Candidate c) throws SQLException {
		String sql = "update candidates set name=?,party=? where id=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, c.getName());
		stmt.setString(2, c.getParty());
		stmt.setInt(3, c.getId());
		int cnt = stmt.executeUpdate();
		System.out.println("rows affected::" + cnt);

	}

	public List<PartyVotes> getPartywiseVotes() throws SQLException {
		List<PartyVotes> list = new ArrayList<>();
		String sql = "select party,sum(votes) Sum_votes from candidates group by party";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String party = rs.getString("party");
					int votes = rs.getInt("Sum_votes");
					PartyVotes pv = new PartyVotes(party, votes);
					list.add(pv);
				}
			}

		}
		return list;
	}

}
