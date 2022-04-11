package com.mdream.studyup.service;

import com.mdream.studyup.domain.Account;
import org.springframework.stereotype.Service;

/**
 * @author smn
 * @Description:
 * @date 2022/4/11 0011 21:03
 */
@Service
public interface AccountService {

    Integer regist(Account account);
}
