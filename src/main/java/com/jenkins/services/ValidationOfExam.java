package com.jenkins.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jenkins.entitys.AnswerSheetsOfQuestionpaper;

import com.jenkins.repositaries.Reposiatry;

@Service
public class ValidationOfExam {

	@Autowired
	Reposiatry repo;

	public Integer vadidatingMarks(List<AnswerSheetsOfQuestionpaper> q) {

		class Sorted implements Comparator<AnswerSheetsOfQuestionpaper> {

			@Override
			public int compare(AnswerSheetsOfQuestionpaper o1, AnswerSheetsOfQuestionpaper o2) {

				return o1.qno - o2.qno;
			}

		}
		Collections.sort(q, new Sorted());

		//List<AnswerSheetsOfQuestionpaper> answers = repo.findByquestionPaperNoByqnoAsc();
		List<AnswerSheetsOfQuestionpaper> answers = repo.findAll();

		int x = 0;
		for (int i = 0; i < q.size(); i++) {
			if (q.get(i).answer == answers.get(i).answer) {
				x++;
			}
		}

		return x;
	}

	public List<AnswerSheetsOfQuestionpaper> addAnswerSheet(List<AnswerSheetsOfQuestionpaper> q) {

		List<AnswerSheetsOfQuestionpaper> m = repo.saveAll(q);
		return m;
	}

	public List<AnswerSheetsOfQuestionpaper> getAll() {
		
		return repo.findAll();
	}

}
