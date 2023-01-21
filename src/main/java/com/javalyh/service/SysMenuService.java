package com.javalyh.service;

import com.javalyh.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author li192
*/
public interface SysMenuService extends IService<SysMenu> {

    List<SysMenu> buildTreeMenu(List<SysMenu> sysMenuList);
}
