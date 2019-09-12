package com.xyd.mcplat.entity.sys.user;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * @project: mcplat
 * @description:
 * @author: zp
 * @create: 2019-09-11 15:42
 **/
@Alias(value="sysUser")
public class SysUser implements Serializable {


    private static final long serialVersionUID = -6089306620580987021L;

    private Long userId;

    private String userName;

    private String note;

    public SysUser(Long userId, String userName, String note) {
        this.userId = userId;
        this.userName = userName;
        this.note = note;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long id) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
