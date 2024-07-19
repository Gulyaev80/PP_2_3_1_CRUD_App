package web.service;

import web.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> withdrawAllUsers();

    Optional<User> findByUserId(Long id);

    void updateUser(User user);

    void deleteByUser(Long id);

    void saveUser(User user);
}
