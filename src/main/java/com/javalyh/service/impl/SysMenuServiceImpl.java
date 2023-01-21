package com.javalyh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javalyh.entity.SysMenu;
import com.javalyh.service.SysMenuService;
import com.javalyh.mapper.SysMenuMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author li192
*/
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu>
    implements SysMenuService{

    @Override
    public List<SysMenu> buildTreeMenu(List<SysMenu> sysMenuList) {
        List<SysMenu> resultMenuList=new ArrayList<>();

        for(SysMenu sysMenu:sysMenuList){

            // 寻找子节点
            for(SysMenu e:sysMenuList){
                if(e.getParentId()==sysMenu.getId()){
                    sysMenu.getChildren().add(e);
                }
            }

            if(sysMenu.getParentId()==0L){
                resultMenuList.add(sysMenu);
            }
        }

        return resultMenuList;
    }
}




