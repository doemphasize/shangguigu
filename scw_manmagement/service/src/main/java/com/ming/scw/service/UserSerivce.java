package com.ming.scw.service;

import bean.TUser;
import org.springframework.stereotype.Service;


public interface UserSerivce {
    public TUser getUserById(Integer id);
    public  Boolean register(TUser user);
}
