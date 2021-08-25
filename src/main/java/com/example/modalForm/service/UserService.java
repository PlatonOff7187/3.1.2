package com.example.modalForm.service;

import com.example.modalForm.model.Role;
import com.example.modalForm.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void save(User user);

    User show(int id);

    void update(User user, String[] role);

    Role showRole(int id);

    void delete(int id);

    User getUserById(Integer id);

}