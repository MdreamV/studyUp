package com.mdream.studyup.controller;

import com.mdream.studyup.domain.Account;
import com.mdream.studyup.service.AccountService;
import com.mdream.studyup.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author smn
 * @Description:
 * @date 2022/4/11 0011 21:05
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 注册用户
     */
    @PostMapping("/regist")
    public ResultUtil<Integer> regist() {
        Account account = new Account();
        Integer resultFlag = accountService.regist(account);
        return ResultUtil.success(resultFlag);
    }
}
