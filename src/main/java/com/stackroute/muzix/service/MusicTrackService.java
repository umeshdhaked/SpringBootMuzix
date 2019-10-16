package com.stackroute.muzix.service;

import com.stackroute.muzix.model.User;

public interface MusicTrackService {
    public Iterable<User> saveTrack(User user);
    public Iterable<User> displayAllTrack();
    public void removeTrack(int trackId);
    public void updateTrackComment(User user);


}
