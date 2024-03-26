package com.example.diojavaaipowered2024.service;

import com.example.diojavaaipowered2024.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
