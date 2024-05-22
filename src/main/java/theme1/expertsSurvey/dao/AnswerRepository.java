package theme1.expertsSurvey.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import theme1.expertsSurvey.models.Answer;
import theme1.expertsSurvey.models.User;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {
}
