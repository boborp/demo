package com.monster.sb.demo.app.controllers;


import com.monster.sb.demo.app.models.UserListModel;
import com.monster.sb.demo.app.models.UserModel;
import com.monster.sb.demo.app.services.UsersApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {


    private UsersApi userRepository;

    @Autowired
    public UserController(UsersApi userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Get all users list.
     *
     * @return the list
     */
    @GetMapping("/users")
    public ResponseEntity<UserListModel> getAllUsers()
    {
        return ResponseEntity.ok().body(userRepository.getAll());
    }

    /**
     * Gets users by id.
     *
     * @param userId the user id
     * @return the users by id
     */
    @GetMapping("/users/{id}")
    public ResponseEntity<UserModel> getUsersById(@PathVariable(value = "id") Long userId)
    {
        UserModel user = userRepository
                .getById(userId)
                .orElse(null);

        if (user == null)
        {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(user);
    }
}

