package kz.itstep.springboot1.service;

import kz.itstep.springboot1.model.User;
import kz.itstep.springboot1.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service // только один раз инициализировался и потом пере использовался как Singleton
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User createByUser(User user){
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id ) {
        return userRepository.findById(id);
    }
    public User getUserByUsername( String username ) {
        return userRepository.findByUsername(username);
    }
}
