package com.monster.sb.demo.app.infrastructure;

import com.monster.sb.demo.domain.User;
import com.monster.sb.demo.domain.UserRepository;
import com.monster.sb.demo.app.models.UserModel;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public Optional<User> findById(Long userId) {
        return Optional.of(new User(userId,
                "first" + userId,
                "last" + userId,
                userId+"@monster.com",
                Date.from(Instant.now()),
                1,
                Date.from(Instant.now()),
                2
                ));
    }

    @Override
    public List<User> findAll() {
        return List.of(
            new User(1,
                "first" + 1,
                "last" + 1,
                     1+"@monster.com",
                     Date.from(Instant.now()),
                    1,
                    Date.from(Instant.now()),
                    2
                    ),new User(2,
                        "first" + 2,
                        "last" + 2,
                        2+"@monster.com",
                        Date.from(Instant.now()),
                        1,
                        Date.from(Instant.now()),
                        2
                ) );
    }
}
