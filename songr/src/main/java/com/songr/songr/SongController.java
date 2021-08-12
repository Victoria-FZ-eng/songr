package com.songr.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.*;

@Controller
public class SongController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/")
    public String home(Model model){
        return "home.html";
    }

    @GetMapping("/albums")
    public String getAlbums(Model model){
        // lab11
//        List<Album> albums = new ArrayList<Album>();
//        Album one = new Album("Album 1","Wael Kfouri", "11",".50","https://f7481eb677d3e45fab69-143e84f0de5e1345fe4e1a78797be102.ssl.cf1.rackcdn.com/160827913_best-of-wael-kfoury-ma-w3adtek-bnjom-elail-shayef-el-.jpg");
//        Album two = new Album("Album 2","George Wassouf", "14","1.15","https://i.ytimg.com/vi/SQh1Rj-1HFs/maxresdefault.jpg");
//        Album three = new Album("Album 3","Shireen", "12",".47","https://pbs.twimg.com/media/D0-djL-X4AIBhuN.jpg");
//
//        albums.add(one);
//        albums.add(two);
//        albums.add(three);
//
//        model.addAttribute("albums", albums);

        // lab 12
        model.addAttribute("albums", albumRepository.findAll());
        return "albums.html";
    }

    @RequestMapping("/addAlbum")
    @PostMapping("/addAlbum")
    public RedirectView addAlbum(String title, String artist, String count, String sec, String cover){
        Album album = new Album(title,artist,count,sec,cover);
        albumRepository.save(album);
        return new  RedirectView("/albums");

    }


    @RequestMapping("/songs")
    @GetMapping("/songs")
    public String getSongs(Model model){

        model.addAttribute("songs", songRepository.findAll());
        return "songs.html";
    }

    @RequestMapping("/songs/{album.id}")
    @GetMapping("/songs/{album.id}")
    public String getSongsAlbumSpecified(@RequestParam(value = "id")Integer id, Model model){

        model.addAttribute("songs", albumRepository.findById(id));
        return "songs.html";
    }

    @RequestMapping("/addSong")
    @PostMapping("/addSong")
    public RedirectView addSong(String title, int count, double sec, String albumx){
        Album album = (Album) albumRepository.findByTitle(albumx);
        Song song = new Song(title,sec,count, album);
        songRepository.save(song);
        return new  RedirectView("/songs");

    }

}
