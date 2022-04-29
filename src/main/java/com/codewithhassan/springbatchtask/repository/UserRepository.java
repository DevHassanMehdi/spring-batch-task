package com.codewithhassan.springbatchtask.repository;

import com.codewithhassan.springbatchtask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Our GPA repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
