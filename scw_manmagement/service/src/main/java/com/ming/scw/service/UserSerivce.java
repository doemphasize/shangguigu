package com.ming.scw.service;

import bean.TUser;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserSerivce {
    public TUser getUserById(Integer id);
    public  Boolean register(TUser user);

    public TUser login(TUser user);
}
