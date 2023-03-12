package com.codewithankit.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codewithankit.blog.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
