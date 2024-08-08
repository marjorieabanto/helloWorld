package com.example.helloWorld.repository;



import com.example.helloWorld.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long > {
}
