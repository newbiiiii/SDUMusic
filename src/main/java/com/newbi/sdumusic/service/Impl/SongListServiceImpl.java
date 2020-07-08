package com.newbi.sdumusic.service.Impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.newbi.sdumusic.common.CodeConsts;
import com.newbi.sdumusic.entity.SongList;
import com.newbi.sdumusic.mapper.SongListMapper;
import com.newbi.sdumusic.service.SongListService;
import com.newbi.sdumusic.utils.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongListServiceImpl implements SongListService {

    @Autowired
    SongListMapper songListMapper;

    @Override
    public String allSongList() {
        List<SongList> songLists = songListMapper.allSongList();
        JSONObject jsonObject = new JSONObject();
        Meta meta = new Meta();

        if (songLists != null) {
            meta.setCode(CodeConsts.CODE_SUCCESS);
            meta.setMsg("获取歌单成功");
        }

        jsonObject.put("data", songLists);
        jsonObject.put("meta", meta);

        return JSON.toJSONString(jsonObject);
    }

    @Override
    public String getSongListByStyle(String style) {
        List<SongList> songLists = songListMapper.getSongByStyle(style);
        JSONObject jsonObject = new JSONObject();
        Meta meta = new Meta();

        if (songLists != null) {
            meta.setCode(CodeConsts.CODE_SUCCESS);
            meta.setMsg("获取歌单成功");
        }

        jsonObject.put("data", songLists);
        jsonObject.put("meta", meta);

        return JSON.toJSONString(jsonObject);
    }
}
