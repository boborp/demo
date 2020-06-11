package com.monster.sb.demo.app.services;

import com.monster.sb.demo.app.models.UserListModel;
import com.monster.sb.demo.app.models.UserModel;
import com.monster.sb.demo.domain.User;
import com.monster.sb.demo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsersApi {
    private UserRepository repo;

    @Autowired
    public UsersApi(UserRepository repo) {
        this.repo = repo;
    }

    public UserListModel getAll() {
        var users = repo.findAll().stream().map(user -> new UserModel(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getCreatedAt(),
                user.getCreatedBy(),
                user.getUpdatedAt(),
                user.getUpdatedBy())).collect(Collectors.toList());
        return new UserListModel(users);
    }

    public Optional<UserModel> getById(Long userId) {
        Optional<User> byId = repo.findById(userId);
        return byId.map(user -> new UserModel(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getCreatedAt(),
                user.getCreatedBy(),
                user.getUpdatedAt(),
                user.getUpdatedBy()));
    }
}
