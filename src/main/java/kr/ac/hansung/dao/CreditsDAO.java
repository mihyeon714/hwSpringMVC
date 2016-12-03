package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Credit;

@Repository
public class CreditsDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from credits";

		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);

	}

	// 해당하는 코드의 과목 정보확인
	public Credit getCredit(String classcode) {
		String sqlStatement = "select * from credits where classcode=?;";

		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { classcode }, new CreditsMapper());
	}

	// 모든정보확인
	public List<Credit> getCredits() {

		String sqlStatement = "select * from credits;";

		return jdbcTemplateObject.query(sqlStatement, new CreditsMapper());

	}

	// 학기별 수강list구하기
	public List<Credit> getCreditsListFromSemester(int year, int semester) {
		String sqlStatement = "select * from credits where year=? and semester=?";
		return jdbcTemplateObject.query(sqlStatement, new Object[] { year, semester }, new CreditsMapper());
	}

	// 이수 구분별 수강list구하기
	public List<Credit> getCreditsListFromClasstype(){
		String sqlStatement = "select classtype, sum(credits) as credits from credits as sumcredit group by classtype";
		return jdbcTemplateObject.query(sqlStatement, new RowMapper<Credit>() {
		    public Credit mapRow(ResultSet rs, int rowNum) throws SQLException {
		    	Credit credit = new Credit();
		    	credit.setClasstype(rs.getString("classtype"));
		    	credit.setCredits(rs.getInt("credits"));
		      return credit;
		    }
		  });
	}

	// 학기별 학점 합구하기
	public Integer getCreditsSumFromSemester(int year, int semester) {

		String sqlStatement = "select sum(credits) from credits where year=? and semester=?";

		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { year, semester }, Integer.class);

	}

	// 이수 구분별 학점 합구하기
	public Integer getCreditsSumFromClasstype(String classtype) {

		String sqlStatement = "select sum(credits) from credits where classtype=?";

		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { classtype }, Integer.class);
	}

	public boolean insert(Credit credit) {
		int year = credit.getYear();
		int semester = credit.getSemester();
		String classcode = credit.getClasscode();
		String classname = credit.getClassname();
		String classtype = credit.getClasstype();
		int credits = credit.getCredits();
		String sqlStatement = "insert into credits (year, semester, classcode, classname, classtype, credits) values (?,?,?,?,?,?)";
		return (jdbcTemplateObject.update(sqlStatement,
				new Object[] { year, semester, classcode, classname, classtype, credits }) == 1);
	}

	public boolean update(Credit credit) {
		String classcode = credit.getClasscode();
		int year = credit.getYear();
		int semester = credit.getSemester();
		String classname = credit.getClassname();
		String classtype = credit.getClasstype();
		int credits = credit.getCredits();
		String sqlStatement = "update credits set year=?,semester=?, classname=?, classtype=?,credits=? where classcode=?";
		return (jdbcTemplateObject.update(sqlStatement,
				new Object[] { year, semester, classcode, classname, classtype, credits }) == 1);
	}

	public boolean delete(String classcode) {
		String sqlStatement = "delete from credits where classcode=?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[] { classcode }) == 1);
	}

}
