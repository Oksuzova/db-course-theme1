package theme1.expertsSurvey.services;

import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;

import org.springframework.transaction.annotation.Transactional;
import theme1.expertsSurvey.models.Answer;
import theme1.expertsSurvey.models.Question;

import java.util.List;

@Service
public class AnswerService {

    @Autowired
    private EntityManager entityManager;

    public Answer getAnswerByQuestionId(Long questionId) {
        return entityManager.find(Answer.class, questionId);
    }

    @Transactional
    public List<Answer> getAnswersForQuestion(Long questionId) {
        TypedQuery<Answer> query = entityManager.createQuery(
                "SELECT a FROM Answer a WHERE a.question.id = :questionId", Answer.class);
        query.setParameter("questionId", questionId);
        return query.getResultList();
    }

    @Transactional
    public Answer createAnswer(Answer answer) {
        entityManager.persist(answer);
        return answer;
    }

    @Transactional
    public Answer updateAnswer(Long answerId, Answer updatedAnswer) {
        Answer existingAnswer = entityManager.find(Answer.class, answerId);
        if (existingAnswer != null) {
            existingAnswer.setOption(updatedAnswer.getOption());
            entityManager.merge(existingAnswer);
            return existingAnswer;
        } else {
            return null;
        }
    }

    @Transactional
    public void deleteAnswer(Long answerId) {
        Answer answer = entityManager.find(Answer.class, answerId);
        entityManager.remove(answer);
    }
}

