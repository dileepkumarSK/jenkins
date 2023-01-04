package com.jenkins.repositaries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jenkins.entitys.AnswerSheetsOfQuestionpaper;


public interface Reposiatry extends JpaRepository<AnswerSheetsOfQuestionpaper, String> {

	//List<AnswerSheetsOfQuestionpaper> findByquestionPaperNoByqnoAsc();
}
