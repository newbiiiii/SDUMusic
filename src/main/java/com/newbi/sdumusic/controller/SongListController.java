package com.newbi.sdumusic.controller;


import com.alibaba.fastjson.JSONObject;
import com.newbi.sdumusic.service.SongListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@CrossOrigin
@RestController
public class SongListController {

    @Autowired
    SongListService songListService;

    @GetMapping("/api/songList")
    public String allSongList(){
        return songListService.allSongList();
    }

    @GetMapping("/api/songList/style")
    public String songListOfStyle(String style){
        return songListService.getSongListByStyle(style);
    }
}
