package com.mdream.studyup.service.impl;

import com.mdream.studyup.dao.AccountDao;
import com.mdream.studyup.dao.InvitationCodeDao;
import com.mdream.studyup.domain.Account;
import com.mdream.studyup.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author smn
 * @Description:
 * @date 2022/4/11 0011 21:04
 */
@Service
public class AccountServiceImpl implements AccountService{

    @Resource
    AccountDao accountDao;

    @Resource
    InvitationCodeDao invitationCodeDao;

    @Override
    public Account regist(Account account, String invitationCode) {
        accountDao.addAccount(account);
        invitationCodeDao.bindUsedAccount(invitationCode, account.getId());
        return account;
    }

    @Override
    public boolean nameIsUsed(String name) {
        return accountDao.nameIsUsed(name);
    }

    @Override
    public boolean nickNameIsUsed(String nickName) {
        return accountDao.nickNameIsUsed(nickName);
    }
}
