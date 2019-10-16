package com.stackroute.muzix.service;

import com.stackroute.muzix.model.Track;

import java.util.List;

public interface MusicTrackService {
    public List<Track> saveTrack(Track track);
    public List<Track> getAllTrack();
    public void removeTrack(int trackId);
    public void updateTrackComment(Track track);

}
