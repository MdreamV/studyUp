package com.mdream.studyup.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;

/**
 * @author smn
 * @Description:
 * @date 2022/4/9 0009 20:39
 */

public class Account {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    @SerializedName("nick_name")
    private String nickName;

    private String password;

    private String pin;

    private Timestamp createTime;

    private Timestamp updataTime;

    public Account() {
    }

    public Account(Integer id, String name, String nickName, String password, String pin) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.password = password;
        this.pin = pin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(Timestamp updataTime) {
        this.updataTime = updataTime;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", pin='" + pin + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updataTime +
                '}';
    }
}
