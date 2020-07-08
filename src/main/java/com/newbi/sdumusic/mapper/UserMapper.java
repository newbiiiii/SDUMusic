package com.newbi.sdumusic.mapper;

import com.newbi.sdumusic.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserByAccount(String userAccount);

}
