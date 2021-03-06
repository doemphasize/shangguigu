package com.ming.scw.serviceImp;

import Utils.Md5Utils;
import Utils.MyStringUtils;
import bean.TRole;
import bean.TUser;
import com.ming.scw.service.UserSerivce;
import dao.TRoleMapper;
import dao.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserImp implements UserSerivce {
    @Autowired
    TUserMapper userMapper;
    @Autowired
    TRoleMapper roleMapper;

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

    public TUser login(TUser user) {
        String username = user.getUsername();
        TUser tUser = userMapper.selectbyExample(user);
        return tUser;
    }

    public List getall() {
        List<TUser> alluser = userMapper.selectAll();
        return alluser;
    }



    public List userroles(Integer id) {
        List<TRole> userroles = roleMapper.userroles(id);
        return userroles;
    }

public List roles(){
    List roles = roleMapper.roles();
    return roles;
}




}
