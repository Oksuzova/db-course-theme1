package theme1.expertsSurvey.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import theme1.expertsSurvey.models.Statistic;
import theme1.expertsSurvey.models.Survey;
import theme1.expertsSurvey.services.StatisticService;
import theme1.expertsSurvey.services.SurveyService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/statistics")
public class StatisticController {

    @Autowired
    private StatisticService statisticService;
    private SurveyService surveyService;

    @GetMapping("/survey/{surveyId}")
    public ResponseEntity<List<Statistic>> getStatisticsBySurveyId(@PathVariable Long surveyId) {
        List<Statistic> statistics = statisticService.getStatisticsBySurveyId(surveyId);
        return new ResponseEntity<>(statistics, HttpStatus.OK);
    }

    @PostMapping("/survey/{surveyId}")
    public ResponseEntity<Statistic> createStatistic(@PathVariable Long surveyId, @Valid @RequestBody Statistic statistic) {
        Survey survey = surveyService.getSurveyById(surveyId); // Получаем опрос по его идентификатору
        statisticService.createStatistic(survey); // Передаем опрос в метод создания статистики
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
