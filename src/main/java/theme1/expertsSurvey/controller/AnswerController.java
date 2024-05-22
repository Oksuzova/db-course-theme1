package theme1.expertsSurvey.controller;

import theme1.expertsSurvey.models.Answer;
import theme1.expertsSurvey.models.Question;
import theme1.expertsSurvey.services.AnswerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import theme1.expertsSurvey.services.QuestionService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @Autowired
    private QuestionService questionService;

    @GetMapping("/{questionId}")
    public ResponseEntity<List<Answer>> getAnswersForQuestion(@PathVariable Long questionId) {
        List<Answer> answers = answerService.getAnswersForQuestion(questionId);
        return new ResponseEntity<>(answers, HttpStatus.OK);
    }

    @PostMapping("/{questionId}")
    public ResponseEntity<Answer> createAnswer(@PathVariable Long questionId, @Valid @RequestBody Answer answer) {
        Question question = questionService.getQuestionById(questionId);
        answer.setQuestion(question);
        Answer createdAnswer = answerService.createAnswer(answer);
        question.setAnswer(createdAnswer);
        return new ResponseEntity<>(createdAnswer, HttpStatus.CREATED);
    }

    @PutMapping("/{answerId}")
    public ResponseEntity<Answer> updateAnswer(@PathVariable Long answerId, @Valid @RequestBody Answer answer) {
        Answer updatedAnswer = answerService.updateAnswer(answerId, answer);
        return new ResponseEntity<>(updatedAnswer, HttpStatus.OK);
    }

    @DeleteMapping("/{answerId}")
    public ResponseEntity<?> deleteAnswer(@PathVariable Long answerId) {
        answerService.deleteAnswer(answerId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
