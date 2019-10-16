package com.stackroute.muzix.repository;

import com.stackroute.muzix.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Integer> {

}
