package com.mdream.studyup.service.impl;

import com.mdream.studyup.dao.InvitationCodeDao;
import com.mdream.studyup.service.InvitationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author smn
 * @Description:
 * @date 2022/4/13 0013 23:03
 */
@Service
public class InvitationCodeServiceImpl implements InvitationCodeService {

    @Autowired
    InvitationCodeDao invitationCodeDao;

    @Override
    public boolean isUnusedCode(String code) {
        return invitationCodeDao.isUnusedCode(code);
    }
}
