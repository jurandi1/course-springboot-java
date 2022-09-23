package com.juniorweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
