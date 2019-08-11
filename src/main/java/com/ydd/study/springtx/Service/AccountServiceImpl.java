package com.ydd.study.springtx.Service;

import com.ydd.study.springtx.Dao.AccountDao;
public class AccountServiceImpl  implements AccountService {
	private AccountDao accountDao;

	@Override
	public void transer(int from, int to, double money) {
		accountDao.decreseMoney(from, money);
		accountDao.increseMoney(to, money);

	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
