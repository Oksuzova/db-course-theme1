package theme1.expertsSurvey.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import theme1.expertsSurvey.models.AssignedSurvey;
import theme1.expertsSurvey.models.AssignedSurveyId;

import java.util.Optional;

@Repository
public interface AssignedSurveyRepository extends CrudRepository<AssignedSurvey, AssignedSurveyId> {
    Optional<AssignedSurvey> findById(AssignedSurveyId assignedSurveyId);

    void deleteById(AssignedSurveyId assignedSurveyId);
}
