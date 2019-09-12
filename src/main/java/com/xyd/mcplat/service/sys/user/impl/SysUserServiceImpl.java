package com.xyd.mcplat.service.sys.user.impl;

import com.xyd.mcplat.dao.sys.user.SysUserDao;
import com.xyd.mcplat.entity.sys.user.SysUser;
import com.xyd.mcplat.service.sys.user.SysUserService;
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
