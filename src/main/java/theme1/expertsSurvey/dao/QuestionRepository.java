package theme1.expertsSurvey.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import theme1.expertsSurvey.models.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
}
