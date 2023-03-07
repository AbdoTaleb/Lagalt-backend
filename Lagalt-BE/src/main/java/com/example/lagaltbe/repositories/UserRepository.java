package com.example.lagaltbe.repositories;

import com.example.lagaltbe.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    @Query(value = "SELECT * FROM users WHERE user_name = ?", nativeQuery = true)
    Users findByName(String name);
}
