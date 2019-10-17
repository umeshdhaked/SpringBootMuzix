package com.stackroute.muzix.service;

import com.stackroute.muzix.model.Track;
import com.stackroute.muzix.repository.TrackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MusicTrackServiceImpl implements MusicTrackService {

    TrackRepo trackRepo;
    @Autowired
    public MusicTrackServiceImpl(TrackRepo trackRepo) {
        this.trackRepo = trackRepo;
    }

    @Override
    public List<Track> saveTrack(Track track) {
        trackRepo.save(track);
        return getAllTrack();
    }

    @Override
    public List<Track> getAllTrack() {
        return trackRepo.findAll();
    }

    @Override
    public void removeTrack(int trackId) {
        trackRepo.deleteById(trackId);

    }

    @Override
    public void updateTrackComment(Track track) {
        trackRepo.findAll();

        Track track1 = trackRepo.getOne(track.getTrackId());
        track1.setTrackComment(track.getTrackComment());

        trackRepo.save(track1);

    }

}
