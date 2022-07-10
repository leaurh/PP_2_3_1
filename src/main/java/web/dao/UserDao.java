package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();

    void saveUser(User user);

    User getUserById(int id);

    void updateUser(int id, User updatedUser);

    void deleteUser(int id);
}