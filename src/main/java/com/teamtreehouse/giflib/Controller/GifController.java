package com.teamtreehouse.giflib.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

        @RequestMapping("/")
        public String listGifs() {
            return "home";
        }

    @RequestMapping("/gif")
    @ResponseBody
    public String viewGifs() {
        return "Viewing gifs";
    }
}
