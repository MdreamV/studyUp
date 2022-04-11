package com.mdream.studyup;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.mdream.studyup.domain.Account;
import com.mdream.studyup.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudyupApplicationTests {

	@Autowired
	private AccountMapper accountMapper;

	//Mybatis-Plus介绍
	// https://blog.csdn.net/CodeInCoke/article/details/121030290

	@Test
	public void testSelect() {
		System.out.println(("----- selectAll method test ------"));
		List<Account> accountList = accountMapper.selectList(null);
		for (Account account : accountList) {
			System.out.println(account);
		}
	}

	@Test
	public void testAdd() {
		System.out.println(("----- add method test ------"));
		Account account = new Account();
		account.setName("BB");
		account.setNickName("AA");
		account.setPassword("123456789");
		account.setPin("000000");
		accountMapper.insert(account);

	}

	@Test
	public void update() {
		QueryWrapper<Account> accountWrapper = new QueryWrapper<>();
		accountWrapper.eq("name", "BB");
		Account account = accountMapper.selectOne(accountWrapper);
		account.setName("BB1");
		account.setNickName("AA");
		account.setPassword("123456789");
		account.setPin("111111");
		accountMapper.updateById(account);

	}

	@Test
	public void delete() {
		QueryWrapper<Account> accountWrapper = new QueryWrapper<>();
		accountWrapper.eq("name", "BB1");
		Account account = accountMapper.selectOne(accountWrapper);
		accountMapper.deleteById(account);
	}

}
