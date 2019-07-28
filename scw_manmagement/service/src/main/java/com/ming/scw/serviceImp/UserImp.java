package com.ming.scw.serviceImp;

import Utils.Md5Utils;
import Utils.MyStringUtils;
import bean.TUser;
import com.ming.scw.service.UserSerivce;
import dao.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserImp implements UserSerivce {
    @Autowired
    TUserMapper userMapper;
    public TUser getUserById(Integer id) {

        return  userMapper.selectByPrimaryKey(id);
    }

    public Boolean register(TUser user) {

        String digest = Md5Utils.digest(user.getUserpswd());
        user.setUserpswd(digest);
        user.setLoginacct(user.getUsername());
        user.setCreatetime(MyStringUtils.formatdate(new Date()));

        int insert = 0;
        try {
            insert = userMapper.insert(user);
        } catch (Exception e) {
           return false;
        }
        if(insert==1){
            return true;
        }else
            return false;
    }

}
