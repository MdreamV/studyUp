package com.mdream.studyup.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mdream.studyup.domain.InvitationCode;
import com.mdream.studyup.mapper.InvitationCodeMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author smn
 * @Description:
 * @date 2022/4/13 0013 23:02
 */
@Component
public class InvitationCodeDao {

    @Resource
    InvitationCodeMapper invitationCodeMapper;

    /**
     * 邀请码没有被使用
     * @param code
     * @return
     */
    public boolean isUnusedCode(String code) {
        QueryWrapper<InvitationCode> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("code", code)
                .eq("used", 0);
        InvitationCode invitationCode = invitationCodeMapper.selectOne(queryWrapper);
        return invitationCode != null;
    }

    /**
     * 绑定注册账户
     */
    public void bindUsedAccount(String code, Integer accountId) {
        QueryWrapper<InvitationCode> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("code", code)
                .eq("used", 0);
        InvitationCode invitationCode = invitationCodeMapper.selectOne(queryWrapper);
        invitationCode.setUsedAccountId(accountId);
        invitationCode.setUsed(1);
        invitationCodeMapper.updateById(invitationCode);
    }

    /**
     * 绑定申请账户
     */
    public void bindApplyAccount(String code, Integer accountId) {
        QueryWrapper<InvitationCode> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("code", code)
                .eq("use_account_id", null);
        InvitationCode invitationCode = invitationCodeMapper.selectOne(queryWrapper);
        invitationCode.setApplyAccountId(accountId);
        invitationCodeMapper.updateById(invitationCode);
    }
}
