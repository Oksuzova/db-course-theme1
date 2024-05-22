package theme1.expertsSurvey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import theme1.expertsSurvey.models.Question;
import theme1.expertsSurvey.models.Survey;
import theme1.expertsSurvey.services.QuestionService;
import theme1.expertsSurvey.services.SurveyService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private SurveyService surveyService;

    @GetMapping("/survey/{surveyId}")
    public ResponseEntity<List<Question>> getQuestionsBySurveyId(@PathVariable Long surveyId) {
        List<Question> questions = questionService.getQuestionsBySurveyId(surveyId);
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    @GetMapping("/{questionId}")
    public ResponseEntity<Question> getQuestionById(@PathVariable Long questionId) {
        Question question = questionService.getQuestionById(questionId);
        return new ResponseEntity<>(question, HttpStatus.OK);
    }

    @PostMapping("/survey/{surveyId}")
    public ResponseEntity<Question> createQuestion(@PathVariable Long surveyId, @Valid @RequestBody Question question) {
        Survey survey = surveyService.getSurveyById(surveyId);
        questionService.createQuestion(question, survey);
        return new ResponseEntity<>(question, HttpStatus.CREATED);
    }

    @PutMapping("/{surveyId}/{questionId}")
    public ResponseEntity<Question> updateQuestion(@PathVariable Long questionId,
                                                   @Valid @RequestBody Question question,
                                                   @PathVariable Long surveyId) {
        question.setId(questionId);
        Survey survey = surveyService.getSurveyById(surveyId);
        question.setSurvey(survey);
        questionService.updateQuestion(question);
        return new ResponseEntity<>(question, HttpStatus.OK);
    }

    @DeleteMapping("/{questionId}")
    public ResponseEntity<?> deleteQuestion(@PathVariable Long questionId) {
        questionService.deleteQuestion(questionId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
