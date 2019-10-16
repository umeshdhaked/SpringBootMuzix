package com.stackroute.muzix.service;

import com.stackroute.muzix.model.User;
import com.stackroute.muzix.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.Optional;

@Repository
public class MusicTrackServiceImpl implements MusicTrackService {

    UserRepo userRepo;
    @Autowired
    public MusicTrackServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Iterable<User> saveTrack(User user) {
        userRepo.save(user);
        return displayAllTrack();
    }

    @Override
    public Iterable<User> displayAllTrack() {
        return userRepo.findAll();
    }

    @Override
    public void removeTrack(int trackId) {
        userRepo.deleteById(trackId);

    }

    @Override
    public void updateTrackComment(User user) {
        User user1 = new User();
        user1.setTrackId(user.getTrackId());
        user1.setTrackComment(user.getTrackComment());
        user1.setTrackName(user.getTrackName());

        saveTrack(user1);

    }
}
