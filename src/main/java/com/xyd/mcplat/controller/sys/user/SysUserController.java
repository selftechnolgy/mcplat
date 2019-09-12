package com.xyd.mcplat.controller.sys.user;

import com.xyd.mcplat.service.sys.user.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 系统用户控制
 * @author: zp
 * @create: 2019-09-11 15:56
 **/
@Controller
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;


    @ResponseBody
    @GetMapping(value="/getUser")
    public Map<String,Object> getUser(Long userId){
        Map<String,Object> map = new HashMap<>();
        map.put("data",sysUserService.getUser(userId));
        return map;
    }

}
