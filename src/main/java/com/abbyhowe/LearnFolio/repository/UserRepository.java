package com.abbyhowe.LearnFolio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abbyhowe.LearnFolio.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
