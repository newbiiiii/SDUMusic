package com.newbi.sdumusic.service.Impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.newbi.sdumusic.common.CodeConsts;
import com.newbi.sdumusic.entity.User;
import com.newbi.sdumusic.mapper.UserMapper;
import com.newbi.sdumusic.service.UserService;
import com.newbi.sdumusic.utils.Meta;
import com.newbi.sdumusic.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String getUserById(String userAccount, String userPwd) {
        JSONObject jsonObject = new JSONObject();
        User user = userMapper.getUserByAccount(userAccount);
        Meta meta = new Meta();

        if (user == null) {
            meta.setCode(CodeConsts.CODE_ACCOUNT_NOT_EXIST);
            meta.setMsg("登录失败，账号不存在");
        }else if (userPwd.equals(user.getUserPwd())) {
            meta.setCode(CodeConsts.CODE_SUCCESS);
            meta.setMsg("登录成功");
            String token = TokenUtil.getToken(user);
            user.setToken(token);
        } else {
            meta.setCode(CodeConsts.CODE_WRONG_PASSWORD);
            meta.setMsg("登录失败，账号或密码错误");
        }

        jsonObject.put("data", user);
        jsonObject.put("meta", meta);

        return JSON.toJSONString(jsonObject);
    }
}
