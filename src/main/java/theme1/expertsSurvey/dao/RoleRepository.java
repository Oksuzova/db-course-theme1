package theme1.expertsSurvey.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import theme1.expertsSurvey.models.Role;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}

