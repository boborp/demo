package com.monster.sb.demo.domain;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository /*extends JpaRepository<User, Long>*/ {
    Optional<User> findById(Long userId);
    List<User> findAll();
}

