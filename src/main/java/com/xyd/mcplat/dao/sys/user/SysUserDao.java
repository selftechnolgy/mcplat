package com.xyd.mcplat.dao.sys.user;

import com.xyd.mcplat.entity.sys.user.SysUser;
import org.springframework.stereotype.Repository;

/**
 * @Description: 系统用户Dao
 * @Author: zp
 * @Date: 2019/9/11
 */
@Repository
public interface SysUserDao {
    SysUser getUser(Long userId);
}
