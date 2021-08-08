package com.songr.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class HelloController {


    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello!";
    }

    @GetMapping("/capitalize") // http://localhost:8080/capitalize?word=this is Kinda Capitalized
    @ResponseBody
    public String capitalize(@RequestParam String word){
        Capitaize cap = new Capitaize(word);
        return cap.getWord();
    }


//    @GetMapping("/albums")
//    public String getAlbums(Model model){
//        List<Album> albums = new ArrayList<Album>();
//        Album one = new Album("Album 1","Wael Kfouri", 11,.50,"https://f7481eb677d3e45fab69-143e84f0de5e1345fe4e1a78797be102.ssl.cf1.rackcdn.com/160827913_best-of-wael-kfoury-ma-w3adtek-bnjom-elail-shayef-el-.jpg");
//        Album two = new Album("Album 2","George Wassouf", 14,1.15,"https://i.ytimg.com/vi/SQh1Rj-1HFs/maxresdefault.jpg");
//        Album three = new Album("Album 3","Shireen", 12,.47,"https://pbs.twimg.com/media/D0-djL-X4AIBhuN.jpg");
//
//        albums.add(one);
//        albums.add(two);
//        albums.add(three);
//
//        model.addAttribute("albums", albums);
//        return "albums.html";
//    }
}
