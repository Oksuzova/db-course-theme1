package theme1.expertsSurvey.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import theme1.expertsSurvey.models.Statistic;

@Repository
public interface StatisticRepository extends CrudRepository<Statistic, Long> {
}
