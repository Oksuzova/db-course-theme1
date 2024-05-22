package theme1.expertsSurvey.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import theme1.expertsSurvey.models.Survey;

@Repository
public interface SurveyRepository extends CrudRepository<Survey, Long> {
}
