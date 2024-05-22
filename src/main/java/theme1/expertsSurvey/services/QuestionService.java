package theme1.expertsSurvey.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;

import org.springframework.transaction.annotation.Transactional;
import theme1.expertsSurvey.models.Question;
import theme1.expertsSurvey.models.Survey;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public List<Question> getQuestionsBySurveyId(Long surveyId) {
        return entityManager.createQuery("from Question where survey.id = :surveyId", Question.class)
                .setParameter("surveyId", surveyId)
                .getResultList();
    }

    @Transactional
    public Question getQuestionById(Long questionId) {
        return entityManager.find(Question.class, questionId);
    }

    @Transactional
    public void createQuestion(Question question, Survey survey) {
        question.setSurvey(survey);
        entityManager.persist(question);
    }

    @Transactional
    public void updateQuestion(Question question) {
        entityManager.merge(question);
    }

    @Transactional
    public void deleteQuestion(Long questionId) {
        Question question = getQuestionById(questionId);
        entityManager.remove(question);
    }
}
