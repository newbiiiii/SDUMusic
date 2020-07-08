package com.newbi.sdumusic.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Song {

    private Integer songId;

    private Integer singerId;

    private String songName;

    private String introduction;

    private Date createTime;

    private String cover;

    private String lyrics;

    private String songPath;

}
