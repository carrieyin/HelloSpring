package com.ydd.study.springtx.Service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.ydd.study.springtx.Dao.AccountDao;
public class AccountServiceImpl  implements AccountService {
	private AccountDao accountDao;
	private TransactionTemplate tt;

	@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=false)
	public void transer(final int from, final int to, final double money) {
		accountDao.decreseMoney(from, money);
		//int i = 1/0;
		accountDao.increseMoney(to, money);		
	}
	/*@Override
	public void transer(final int from, final int to, final double money) {
		tt.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				accountDao.decreseMoney(from, money);
				int i = 1/0;
				accountDao.increseMoney(to, money);

			}
		});
		
	}*/

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public TransactionTemplate getTt() {
		return tt;
	}

	public void setTt(TransactionTemplate tt) {
		this.tt = tt;
	}
	
	
}
