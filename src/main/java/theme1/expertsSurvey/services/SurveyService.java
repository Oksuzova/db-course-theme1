package theme1.expertsSurvey.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import org.springframework.transaction.annotation.Transactional;
import theme1.expertsSurvey.models.Survey;

import java.util.Date;
import java.util.List;
@Service
public class SurveyService {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Survey createSurvey(String name, Date startDate, Date endDate) {
        Survey survey = new Survey();
        survey.setName(name);
        survey.setStartDate(startDate);
        survey.setEndDate(endDate);
        entityManager.persist(survey);
        return survey;
    }

    @Transactional
    public Survey getSurveyById(Long id) {
        return entityManager.find(Survey.class, id);
    }

    @Transactional
    public List<Survey> getAllSurveys() {
        return entityManager.createQuery("from Survey", Survey.class).getResultList();
    }

    @Transactional
    public Survey updateSurvey(Long id, Survey surveyDetails) {
        Survey survey = getSurveyById(id);
        survey.setName(surveyDetails.getName());
        survey.setStartDate(surveyDetails.getStartDate());
        survey.setEndDate(surveyDetails.getEndDate());
        entityManager.merge(survey);
        return survey;
    }

    @Transactional
    public void deleteSurvey(Long id) {
        Survey survey = getSurveyById(id);
        entityManager.remove(survey);
    }
}
