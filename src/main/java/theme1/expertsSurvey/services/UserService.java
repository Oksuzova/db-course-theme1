package theme1.expertsSurvey.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;

import org.springframework.transaction.annotation.Transactional;
import theme1.expertsSurvey.dao.RoleRepository;
import theme1.expertsSurvey.models.Role;
import theme1.expertsSurvey.models.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private RoleRepository roleRepository;

    @Transactional
    public User createUser(User user) {
        Role role = roleRepository.findById(user.getRole().getId()).orElseThrow(() -> new RuntimeException("Role not found"));

        user.setNickname(user.getNickname());
        user.setPassword(user.getPassword());
        user.setEmail(user.getEmail());
        user.setRole(role);
        entityManager.persist(user);
        return user;
    }

    @Transactional(readOnly = true)
    public User getUserById(Long id) {
        return entityManager.createQuery("select u from User u left join fetch u.role where u.id = :id", User.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public User getUserByNickname(String nickname) {
        // Not implemented
        return null;
    }

    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u left join fetch u.role", User.class).getResultList();
    }

    @Transactional
    public User updateUser(Long id, String nickname, String password, String email) {

        User user = getUserById(id);
        user.setNickname(nickname);
        user.setPassword(password);
        user.setEmail(email);
        entityManager.merge(user);
        return user;
    }

    @Transactional
    public void deleteUser(Long id) {
        User user = getUserById(id);
        entityManager.remove(user);
    }

}