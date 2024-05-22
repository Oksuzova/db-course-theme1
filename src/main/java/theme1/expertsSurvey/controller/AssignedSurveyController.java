package theme1.expertsSurvey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import theme1.expertsSurvey.models.AssignedSurvey;
import theme1.expertsSurvey.services.AssignedSurveyService;

import java.util.List;

@RestController
@RequestMapping("/api/assigned-surveys")
public class AssignedSurveyController {

    @Autowired
    private AssignedSurveyService assignedSurveyService;

    @GetMapping("/{surveyId}/{userId}")
    public ResponseEntity<AssignedSurvey> getAssignedSurvey(@PathVariable Long surveyId, @PathVariable Long userId) {
        AssignedSurvey assignedSurvey = assignedSurveyService.getAssignedSurvey(surveyId, userId);
        if (assignedSurvey != null) {
            return new ResponseEntity<>(assignedSurvey, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/{surveyId}/{userId}")
    public ResponseEntity<AssignedSurvey> createAssignedSurvey(@PathVariable Long surveyId, @PathVariable Long userId) {
        AssignedSurvey assignedSurvey = assignedSurveyService.createAssignedSurvey(surveyId, userId);
        return new ResponseEntity<>(assignedSurvey, HttpStatus.CREATED);
    }

    @DeleteMapping("/{surveyId}/{userId}")
    public ResponseEntity<?> deleteAssignedSurvey(@PathVariable Long surveyId, @PathVariable Long userId) {
        assignedSurveyService.deleteAssignedSurvey(surveyId, userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<AssignedSurvey>> getAllAssignedSurveys() {
        List<AssignedSurvey> assignedSurveys = assignedSurveyService.getAllAssignedSurveys();
        return new ResponseEntity<>(assignedSurveys, HttpStatus.OK);
    }
}
