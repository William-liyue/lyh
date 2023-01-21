package com.javalyh.service;

import com.javalyh.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author li192
*/
public interface SysUserService extends IService<SysUser> {


    SysUser getByUsername(String username);

    String getUserAuthorityInfo(Long userId);
}
