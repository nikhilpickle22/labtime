package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.Login;

@Repository
public interface RegRepo extends JpaRepository<Login, String> {
    Login findByUsername(String username);
}
