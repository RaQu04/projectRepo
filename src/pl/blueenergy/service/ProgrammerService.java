package pl.blueenergy.service;

import pl.blueenergy.document.ApplicationForHolidays;
import pl.blueenergy.document.Document;
import pl.blueenergy.document.DocumentDao;
import pl.blueenergy.document.Questionnaire;

import java.util.List;
import java.util.stream.Collectors;

public class ProgrammerService {

	public void execute(DocumentDao documentDao) {
		List<Document> allDocumentsInDatabase = documentDao.getAllDocumentsInDatabase();
	}

	private List<Questionnaire> getQuestionnaireList(List<Document> list){
		return list.stream()
				.filter(dok -> dok instanceof Questionnaire)
				.map(dok -> (Questionnaire) dok)
				.collect(Collectors.toList());
	}

	private List<ApplicationForHolidays> getApplicationList(List<Document> list){
		return list.stream()
				.filter(dok -> dok instanceof ApplicationForHolidays)
				.map(dok -> (ApplicationForHolidays) dok)
				.collect(Collectors.toList());
	}
}
