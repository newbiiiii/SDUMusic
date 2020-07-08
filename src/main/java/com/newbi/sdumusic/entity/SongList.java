package com.newbi.sdumusic.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SongList {

    private Integer songListId;

    private String songListTitle;

    private String songListCover;

    private String style;

    private String introduction;

}
