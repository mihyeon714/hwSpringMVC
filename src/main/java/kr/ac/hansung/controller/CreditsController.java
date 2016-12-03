package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Credit;
import kr.ac.hansung.service.CreditsService;

@Controller
public class CreditsController {

	private CreditsService creditsService;

	@Autowired
	public void setCreditsService(CreditsService creditsService) {
		this.creditsService = creditsService;
	}

	// 기본적으로 보는거지..
	@RequestMapping("/credits")
	public String showCredits(Model model) {

		List<Credit> credits = creditsService.getCredits();
		model.addAttribute("credits", credits);
		return "credits";
	}

	@RequestMapping("/creditsfromsemester")
	public String showCredits_S(Model model) {

		List<Credit> creditslist = creditsService.getCreditsListFromSemseter(2012, 2);
		model.addAttribute("credits", creditslist);
		return "creditsfromsemester";
	}

	@RequestMapping("/creditsfromclasstype")
	public String showCredits_CT(Model model) {

		List<Credit> credits = creditsService.getCreditsListFromClasstype();
		model.addAttribute("credits", credits);
		return "creditsfromclasstype";
	}

	@RequestMapping(value = "/creditsdetails")
	public String showCreditsDetails(Model model) {
		List<Credit> credits = creditsService.getCreditsListFromSemseter(2012, 1);
		model.addAttribute("credits", credits);
		return "creditsdetails";
	}

	@RequestMapping("/enroll")
	public String enroll(Model model, Credit credit) {
		return "enroll";
	}

	@RequestMapping("/doenroll")
	public String createEnroll(Model model, Credit credit) {

		credit.setSemester(1);
		credit.setYear(2017); // 이거에 대해서 자동으로 하면 좋겠지..
		System.out.println(credit); // 확인하기
		creditsService.insert(credit);

		model.addAttribute("nowcredit", credit);
		return "successenroll";
	}

	@RequestMapping("/showenroll")
	public String showEnroll(Model model) {

		List<Credit> creditslist = creditsService.getCreditsListFromSemseter(2017, 1);
		model.addAttribute("credits", creditslist);
		return "showenroll";
	}
}
