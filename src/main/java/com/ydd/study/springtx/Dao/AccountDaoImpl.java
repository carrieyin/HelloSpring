package com.ydd.study.springtx.Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

	@Override
	public void increseMoney(int id, double money) {

		getJdbcTemplate().update("update t_account set money = money + ? where id = ?", money, id);
	}

	@Override
	public void decreseMoney(int id, double money) {
		getJdbcTemplate().update("update t_account set money = money - ? where id = ?", money, id);
		
	}

}
