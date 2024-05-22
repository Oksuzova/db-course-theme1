package theme1.expertsSurvey.services;

import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import theme1.expertsSurvey.models.AssignedSurvey;
import theme1.expertsSurvey.models.AssignedSurveyId;
import theme1.expertsSurvey.models.Survey;
import theme1.expertsSurvey.models.User;

import java.util.List;

@Service
public class AssignedSurveyService {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public AssignedSurvey createAssignedSurvey(Long surveyId, Long userId) {
        Survey survey = entityManager.find(Survey.class, surveyId);
        User user = entityManager.find(User.class, userId);

        if (survey == null) {
            throw new EntityNotFoundException("Survey with id " + surveyId + " not found");
        }
        if (user == null) {
            throw new EntityNotFoundException("User with id " + userId + " not found");
        }

        AssignedSurveyId id = new AssignedSurveyId(surveyId, userId);

        AssignedSurvey assignedSurvey = new AssignedSurvey();
        assignedSurvey.setSurvey(survey);
        assignedSurvey.setUser(user);
        assignedSurvey.setId(id);

        entityManager.persist(assignedSurvey);

        return assignedSurvey;
    }

    @Transactional
    public void deleteAssignedSurvey(Long surveyId, Long userId) {
        AssignedSurvey assignedSurvey = getAssignedSurvey(surveyId, userId);
        if (assignedSurvey != null) {
            entityManager.remove(assignedSurvey);
        }
    }

    @Transactional
    public List<AssignedSurvey> getAllAssignedSurveys() {
        TypedQuery<AssignedSurvey> query = entityManager.createQuery("SELECT a FROM AssignedSurvey a", AssignedSurvey.class);
        return query.getResultList();
    }

    @Transactional
    public AssignedSurvey getAssignedSurvey(Long surveyId, Long userId) {
        return entityManager.find(AssignedSurvey.class, new AssignedSurveyId(surveyId, userId));
    }
}