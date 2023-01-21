package com.javalyh.controller;

import com.javalyh.entity.R;
import com.javalyh.entity.SysUser;
import com.javalyh.service.SysUserService;
import com.javalyh.util.JwtUtils;
import com.javalyh.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试
 * @author li192
 */
@RestController
@RequestMapping("/login")
public class TestController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/login")
    public R login(){
        String token = JwtUtils.genJwtToken("javalyh");
        return R.ok().put("token",token);
    }
    @RequestMapping("/user/list")
    // @PreAuthorize("hasRole('ROLE_admin2')")
    @PreAuthorize("hasAuthority('system:user:list')")
    public R userList(@RequestHeader(required = false)String token){
        if(StringUtil.isNotEmpty(token)){
            Map<String,Object> resutlMap=new HashMap<>();
            List<SysUser> userList = sysUserService.list();
            resutlMap.put("userList",userList);
            return R.ok(resutlMap);
        }else{
            return R.error(401,"没有权限访问");
        }

    }
}