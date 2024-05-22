package theme1.expertsSurvey.services;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;

import theme1.expertsSurvey.models.Role;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private EntityManager entityManager;

    public List<Role> getAllRoles() {
        return entityManager.createQuery("from Role", Role.class).getResultList();
    }

    public Role getRoleById(Long id) {
        return entityManager.find(Role.class, id);
    }

    @Transactional
    public void createRole(Role role) {
        entityManager.persist(role);
    }

    public void updateRole(Role role) {
        entityManager.merge(role);
    }

    public void deleteRole(Long id) {
        Role role = getRoleById(id);
        entityManager.remove(role);
    }

}
