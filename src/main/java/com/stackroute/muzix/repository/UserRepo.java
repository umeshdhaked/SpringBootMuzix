package com.stackroute.muzix.repository;

import com.stackroute.muzix.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepo extends JpaRepository<Track,Integer> {

}
