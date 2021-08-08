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
    public String hello(){
        return "hello.html";
    }

//    @GetMapping("/capitalize") // http://localhost:8080/capitalize?word=this is Kinda Capitalized
//    @ResponseBody
//    public String capitalize(@RequestParam String word){
//        Capitalize cap = new Capitalize(word);
//        return cap.getWord();
//    }

    @GetMapping("/capitalize") // http://localhost:8080/capitalize?word=this is Kinda Capitalized
    public String capitalize(Model m,@RequestParam String word){
        Capitalize cap = new Capitalize(word);
        m.addAttribute("linesCap",cap);
        return "capital.html";
    }


}
