package org.example.springboot.service;



import org.example.springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}