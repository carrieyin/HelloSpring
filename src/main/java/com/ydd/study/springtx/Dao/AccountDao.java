package com.ydd.study.springtx.Dao;

public interface AccountDao {
	
	public void increseMoney(int id, double money);
	public void decreseMoney(int id, double money);

}
