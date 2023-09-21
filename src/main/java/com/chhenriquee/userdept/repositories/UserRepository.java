package com.chhenriquee.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chhenriquee.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
