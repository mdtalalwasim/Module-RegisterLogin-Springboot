package com.registration.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.login.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}