package com.ming.scw.serviceImp;

import bean.TUser;
import com.ming.scw.service.UserSerivce;
import dao.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImp implements UserSerivce {
    @Autowired
    TUserMapper userMapper;
    public TUser getUserById(Integer id) {

        return  userMapper.selectByPrimaryKey(id);
    }
}
