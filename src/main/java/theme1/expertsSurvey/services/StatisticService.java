package theme1.expertsSurvey.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;

import theme1.expertsSurvey.models.Statistic;
import theme1.expertsSurvey.models.Survey;

import java.util.List;

@Service
public class StatisticService {

    @Autowired
    private EntityManager entityManager;

    public List<Statistic> getStatisticsBySurveyId(Long surveyId) {
        return entityManager.createQuery("from Statistic where survey.id = :surveyId", Statistic.class)
                .setParameter("surveyId", surveyId)
                .getResultList();
    }

    public void createStatistic(Survey survey) {
        Statistic statistic = new Statistic();
        statistic.setSurvey(survey);
        entityManager.persist(statistic);
    }
}

