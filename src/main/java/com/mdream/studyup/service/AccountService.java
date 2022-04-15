package com.mdream.studyup.service;

import com.mdream.studyup.domain.Account;

/**
 * @author smn
 * @Description:
 * @date 2022/4/11 0011 21:03
 */

public interface AccountService {

    Account regist(Account account, String invitationCode);

    boolean nameIsUsed(String name);

    boolean nickNameIsUsed(String nickName);
}
