package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.CreditsDAO;
import kr.ac.hansung.model.Credit;

@Service
public class CreditsService {

	private CreditsDAO creditsDao;

	@Autowired
	public void setCreditsDao(CreditsDAO creditsDao) {
		this.creditsDao = creditsDao;
	}

	public Credit getCredit(String classcode) {
		return creditsDao.getCredit(classcode);
	}

	public List<Credit> getCredits() {
		return creditsDao.getCredits();
	}
	

	public List<Credit> getCreditsListFromSemseter(int year, int semester) {
		return creditsDao.getCreditsListFromSemester(year, semester);
	}

	public List<Credit> getCreditsListFromClasstype() {
		return creditsDao.getCreditsListFromClasstype();
	}

	public Integer getCreditsSumFromSemester(int year, int semester) {
		return creditsDao.getCreditsSumFromSemester(year, semester);
	}

	public Integer getCreditsSumFromClasstype(String classtype) {
		return creditsDao.getCreditsSumFromClasstype(classtype);
	}

	public void insert(Credit credit) {
		
		creditsDao.insert(credit);
	}

}
