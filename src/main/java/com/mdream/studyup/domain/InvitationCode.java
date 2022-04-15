package com.mdream.studyup.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @author smn
 * @Description:
 * @date 2022/4/13 0013 22:59
 */
public class InvitationCode {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String code;

    private Integer used;

    private Integer usedAccountId;

    private Integer applyAccountId;

    public InvitationCode() {
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getUsedAccountId() {
        return usedAccountId;
    }

    public void setUsedAccountId(Integer usedAccountId) {
        this.usedAccountId = usedAccountId;
    }

    public Integer getApplyAccountId() {
        return applyAccountId;
    }

    public void setApplyAccountId(Integer applyAccountId) {
        this.applyAccountId = applyAccountId;
    }

    @Override
    public String toString() {
        return "InvitationCode{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", used=" + used +
                ", usedAccountId=" + usedAccountId +
                ", applyAccountId=" + applyAccountId +
                '}';
    }
}
