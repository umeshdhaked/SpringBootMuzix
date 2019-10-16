package com.stackroute.muzix.service;

import com.stackroute.muzix.model.Track;
import com.stackroute.muzix.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MusicTrackServiceImpl implements MusicTrackService {

    UserRepo userRepo;
    @Autowired
    public MusicTrackServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Iterable<Track> saveTrack(Track track) {
        userRepo.save(track);
        return displayAllTrack();
    }

    @Override
    public Iterable<Track> displayAllTrack() {
        return userRepo.findAll();
    }

    @Override
    public void removeTrack(int trackId) {
        userRepo.deleteById(trackId);

    }

    @Override
    public void updateTrackComment(Track track) {
        Track track1 = new Track();
        track1.setTrackId(track.getTrackId());
        track1.setTrackComment(track.getTrackComment());
        track1.setTrackName(track.getTrackName());

        saveTrack(track1);

    }
}
