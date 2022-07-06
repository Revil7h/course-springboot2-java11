package com.herbertmenezes.course.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herbertmenezes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
