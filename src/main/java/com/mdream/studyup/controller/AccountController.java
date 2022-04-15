package com.mdream.studyup.controller;

import com.google.gson.Gson;
import com.mdream.studyup.domain.Account;
import com.mdream.studyup.service.AccountService;
import com.mdream.studyup.service.InvitationCodeService;
import com.mdream.studyup.util.ControllerResultCode;
import com.mdream.studyup.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public static final Gson gson = new Gson();

    @Autowired
    private AccountService accountService;

    @Autowired
    private InvitationCodeService invitationCodeService;

    /**
     * 注册用户
     */
    @PostMapping("/regist")
    public ResultUtil<Object> regist(@RequestParam("name") String name,
                                      @RequestParam("nick_name") String nickName,
                                      @RequestParam("password") String password,
                                      @RequestParam("pin") String pin,
                                      @RequestParam("invitation_code") String invitationCode) {
        try {
            Account account = new Account();
            account.setName(name);
            account.setNickName(nickName);
            account.setPassword(password);
            account.setPin(pin);

            //邀请码非法
            if (!invitationCodeService.isUnusedCode(invitationCode)) {
                return ResultUtil.fail(ControllerResultCode.INVITATION_CODE_ERROR.getCode(),
                        ControllerResultCode.INVITATION_CODE_ERROR.getMessage());
            }
            //账户名重复
            if (accountService.nameIsUsed(name)) {
                return ResultUtil.fail(ControllerResultCode.ACCOUNT_NAME_IS_EXIT.getCode(),
                        ControllerResultCode.ACCOUNT_NAME_IS_EXIT.getMessage());
            }

            Account addedAccount = accountService.regist(account, invitationCode);
            if (addedAccount != null) {
                return ResultUtil.success(addedAccount);
            } else {
                return ResultUtil.fail();
            }
        } catch (Exception e) {
            LOGGER.info("unknow error", e);
            return ResultUtil.fail();
        }
    }
}
