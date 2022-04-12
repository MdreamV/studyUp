package com.mdream.studyup.dao;


import com.mdream.studyup.domain.Account;
import com.mdream.studyup.mapper.AccountMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author smn
 * @Description:
 * @date 2022/4/11 0011 21:05
 */
@Component
public class AccountDao {

    @Resource
    AccountMapper accountMapper;

    public Integer addAccount(Account account) {
        return accountMapper.insert(account);
    }

}
