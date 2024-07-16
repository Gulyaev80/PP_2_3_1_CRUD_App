package web.service;

import web.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
      List<User> allUsers();
      Optional<User> findById(Long id);
      void updateUser(User user);
      void deleteById(Long id);
      void save(User user);
}
