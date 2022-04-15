package com.mdream.studyup.dao;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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

    public void addAccount(Account account) {
        accountMapper.insert(account);
    }

    public boolean nameIsUsed(String name) {
        QueryWrapper<Account> queryWrapper = new QueryWrapper<Account>();
        queryWrapper.eq("name", name);
        Account account = accountMapper.selectOne(queryWrapper);
        return account != null;
    }

    public boolean nickNameIsUsed(String nickName) {
        QueryWrapper<Account> queryWrapper = new QueryWrapper<Account>();
        queryWrapper.eq("nick_name", nickName);
        Account account = accountMapper.selectOne(queryWrapper);
        return account != null;
    }

}
