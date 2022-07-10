package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    void saveUser(User user);

    User getUserById(int id);

    void updateUser(int id,User updatedUser);

    void deleteUser(int id);

}
