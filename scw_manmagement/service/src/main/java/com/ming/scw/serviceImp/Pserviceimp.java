package com.ming.scw.serviceImp;

import bean.TPermission;
import com.ming.scw.service.TPermissionService;
import dao.TPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class Pserviceimp implements TPermissionService {
    @Autowired
    TPermissionMapper mapper;

    public List getallmenu() {
        //父菜单
        Map<Integer, TPermission> map = new HashMap();
        //存子菜单
         ArrayList<TPermission> menus = new ArrayList<TPermission>();

       //所有菜单
        List<TPermission> list = mapper.selectAll();
        for (TPermission permissions : list) {
            map.put(permissions.getId(),permissions);
            if (permissions.getPid() == 0) {
                menus.add(permissions);
            } else {
                Integer pid = permissions.getPid();
                TPermission parentp = map.get(pid);
                List<TPermission> child = parentp.getChilds();
                if(child!=null){
                    child.add(permissions);
                }else{
                    List childlist = new ArrayList<TPermission>();
                    childlist.add(permissions);
                    parentp.setChilds(childlist);
                    ;}


            }

        }
        return menus;
    }
}