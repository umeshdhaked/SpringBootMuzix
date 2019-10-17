package com.stackroute.muzix.repository;

import com.stackroute.muzix.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TrackRepo extends JpaRepository<Track,Integer> {

}
