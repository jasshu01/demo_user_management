package com.example.user_management.demo_user_management.repository;

import com.example.user_management.demo_user_management.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
