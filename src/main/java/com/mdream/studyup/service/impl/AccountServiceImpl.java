package com.mdream.studyup.service.impl;

import com.mdream.studyup.dao.AccountDao;
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

    @Override
    public Integer regist(Account account) {
        return accountDao.addAccount(account);
    }
}
