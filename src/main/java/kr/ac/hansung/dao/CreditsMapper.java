package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.Credit;

public class CreditsMapper implements RowMapper<Credit>{

	public Credit mapRow(ResultSet rs, int rowNum) throws SQLException {

		Credit credit = new Credit();

		credit.setYear(rs.getInt("year"));
		credit.setSemester(rs.getInt("semester"));
		credit.setClasscode(rs.getString("classcode"));
		credit.setClassname(rs.getString("classname"));
		credit.setClasstype(rs.getString("classtype"));
		credit.setCredits(rs.getInt("credits"));

		return credit;
	}
	
}
