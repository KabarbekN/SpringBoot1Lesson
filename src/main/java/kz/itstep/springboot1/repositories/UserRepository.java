package kz.itstep.springboot1.repositories;

import kz.itstep.springboot1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByUsernameContains(String username);
    User findByUsername(String username);
}
