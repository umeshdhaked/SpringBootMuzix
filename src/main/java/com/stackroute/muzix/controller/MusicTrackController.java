package com.stackroute.muzix.controller;

import com.stackroute.muzix.model.Track;
import com.stackroute.muzix.service.MusicTrackService;
import org.h2.engine.Mode;
import org.h2.engine.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("tracks")
public class MusicTrackController {
    MusicTrackService musicTrackService;

    @Autowired
    public MusicTrackController(MusicTrackService musicTrackService) {
        this.musicTrackService = musicTrackService;
    }


    @PostMapping("track")
    public ResponseEntity<?> saveTrack(@RequestBody Track track) throws IOException {
        musicTrackService.saveTrack(track);
      //response.sendRedirect("/index.html");
        return new ResponseEntity<List<Track> >(musicTrackService.getAllTrack(), HttpStatus.OK);
    }
    @GetMapping("track")
    private ResponseEntity<?> displayAllTrack(){
        return new ResponseEntity<List<Track> >(musicTrackService.getAllTrack(), HttpStatus.OK);
    }
    @DeleteMapping("track")
    private ResponseEntity<?> deleteTrack(@RequestBody Track track){
        musicTrackService.removeTrack(track.getTrackId());
        return new ResponseEntity<List<Track> >(musicTrackService.getAllTrack(), HttpStatus.OK);
    }
    @PutMapping("track")
    private ResponseEntity<?> updateTrack(@RequestBody Track track){
        musicTrackService.updateTrackComment(track);
       return new ResponseEntity<List<Track> >(musicTrackService.getAllTrack(), HttpStatus.OK);
    }





}
