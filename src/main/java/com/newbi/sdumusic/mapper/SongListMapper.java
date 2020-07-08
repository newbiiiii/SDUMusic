package com.newbi.sdumusic.mapper;

import com.newbi.sdumusic.entity.SongList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SongListMapper {

    List<SongList> allSongList();

    List<SongList> getSongByStyle(String style);
}
