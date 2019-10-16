package com.stackroute.muzix.service;

import com.stackroute.muzix.model.Track;
import com.stackroute.muzix.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MusicTrackServiceImpl implements MusicTrackService {

    UserRepo userRepo;
    @Autowired
    public MusicTrackServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<Track> saveTrack(Track track) {
        userRepo.save(track);
        return getAllTrack();
    }

    @Override
    public List<Track> getAllTrack() {
        return userRepo.findAll();
    }

    @Override
    public void removeTrack(int trackId) {
        userRepo.deleteById(trackId);

    }

    @Override
    public void updateTrackComment(Track track) {

      String name="unknown";
      track.setTrackName(name);
        userRepo.save(track);

    }

}
