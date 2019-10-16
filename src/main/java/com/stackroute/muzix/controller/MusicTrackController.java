package com.stackroute.muzix.controller;

import com.stackroute.muzix.model.Track;
import com.stackroute.muzix.service.MusicTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("tracks")
public class MusicTrackController {
    MusicTrackService musicTrackService;

    @Autowired
    public MusicTrackController(MusicTrackService musicTrackService) {
        this.musicTrackService = musicTrackService;
    }


    @PostMapping("track")
    public ResponseEntity<?> saveTrack(@RequestBody Track track){
        musicTrackService.saveTrack(track);
        return displayAllTrack();
    }
    @GetMapping("track")
    private ResponseEntity<?> displayAllTrack(){
        return new ResponseEntity<Iterable<Track> >(musicTrackService.displayAllTrack(), HttpStatus.OK);
    }
    @DeleteMapping("track")
    private ResponseEntity<?> deleteTrack(@RequestBody Track track){
        musicTrackService.removeTrack(track.getTrackId());
        return displayAllTrack();
    }
    @PutMapping("track")
    private ResponseEntity<?> updateTrack(@RequestBody Track track){
        musicTrackService.updateTrackComment(track);
        return displayAllTrack();
    }




}
