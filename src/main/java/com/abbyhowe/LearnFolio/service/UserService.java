package com.abbyhowe.LearnFolio.service;

import com.abbyhowe.LearnFolio.models.User;
import com.abbyhowe.LearnFolio.models.UserFiles;

import java.util.List;


public interface UserService {
    List<User> getAllUsers();

    User save(User user);

    User findById(Long userId);

    List<UserFiles> findFilesByUserId(Long userId);

    User update(User user);

    void deleteFilesByUserId(Long userId);

    void deleteUser(Long userId);
}
