package com.jenkins.contollers;

import java.lang.System.Logger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.entitys.AnswerSheetsOfQuestionpaper;
import com.jenkins.services.ValidationOfExam;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/")
@Log4j2
public class AdminContoller {

	
	@Autowired
	ValidationOfExam service;

	@GetMapping("/validate")
	public Integer validtaion(@RequestBody List<AnswerSheetsOfQuestionpaper> q) {

		return service.vadidatingMarks(q);
	}

	@GetMapping("/get")
	public List<AnswerSheetsOfQuestionpaper> validtaion() {

		return service.getAll();
	}
	@PostMapping("/addanswersheet")
	
	public List<AnswerSheetsOfQuestionpaper> addAnswerSheet(@RequestBody List<AnswerSheetsOfQuestionpaper> a) {
		log.info("enetred in controller");
		return service.addAnswerSheet(a);
	}

}
