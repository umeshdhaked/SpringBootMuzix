package com.stackroute.muzix.repository;

import com.stackroute.muzix.model.Track;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Track,Integer> {

}
