package com.songr.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class SongController {

    @GetMapping("/")
    public String home(Model model){
        return "home.html";
    }

    @GetMapping("/albums")
    public String getAlbums(Model model){
        List<Album> albums = new ArrayList<Album>();
        Album one = new Album("Album 1","Wael Kfouri", "11",".50","https://f7481eb677d3e45fab69-143e84f0de5e1345fe4e1a78797be102.ssl.cf1.rackcdn.com/160827913_best-of-wael-kfoury-ma-w3adtek-bnjom-elail-shayef-el-.jpg");
        Album two = new Album("Album 2","George Wassouf", "14","1.15","https://i.ytimg.com/vi/SQh1Rj-1HFs/maxresdefault.jpg");
        Album three = new Album("Album 3","Shireen", "12",".47","https://pbs.twimg.com/media/D0-djL-X4AIBhuN.jpg");

        albums.add(one);
        albums.add(two);
        albums.add(three);

        model.addAttribute("albums", albums);
        return "albums.html";

    }

}
