package web.dao;

import web.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {


    List<User> withdrawAllUsers();

    void save(User user);

    Optional<User> findById(Long id);

    void updateUser(User user);

    void deleteById(Long id);


}
