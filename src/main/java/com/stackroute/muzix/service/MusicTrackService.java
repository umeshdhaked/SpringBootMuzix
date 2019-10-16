package com.stackroute.muzix.service;

import com.stackroute.muzix.model.Track;

public interface MusicTrackService {
    public Iterable<Track> saveTrack(Track track);
    public Iterable<Track> displayAllTrack();
    public void removeTrack(int trackId);
    public void updateTrackComment(Track track);


}
