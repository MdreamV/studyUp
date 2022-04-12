package com.mdream.studyup.controller;

import com.mdream.studyup.domain.Account;
import com.mdream.studyup.service.AccountService;
import com.mdream.studyup.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public ResultUtil<Integer> regist(@RequestParam("name") String name,
                                      @RequestParam("nick_name") String nickName,
                                      @RequestParam("password") String password,
                                      @RequestParam("pin") String pin,
                                      @RequestParam("invitation_code") String invitation_code) {
        Account account = new Account();
        account.setName(name);
        account.setNickName(nickName);
        account.setPassword(password);
        account.setPin(pin);

        Integer resultFlag = accountService.regist(account);
        return ResultUtil.success(resultFlag);
    }
}
