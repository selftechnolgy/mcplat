package com.xyd.mcplat.sys.user.service.impl;

import com.xyd.mcplat.sys.user.dao.SysUserDao;
import com.xyd.mcplat.sys.user.entity.SysUser;
import com.xyd.mcplat.sys.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @project: mcplat
 * @description:
 * @author: zp
 * @create: 2019-09-11 15:58
 **/
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public SysUser getUser(Long userId) {
        return sysUserDao.getUser(userId);
    }
}
