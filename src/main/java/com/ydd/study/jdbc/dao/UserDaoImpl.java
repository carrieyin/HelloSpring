package com.ydd.study.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ydd.study.jdbc.entity.User;

public class UserDaoImpl implements UserDao{
	private JdbcTemplate  jt;
	

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void save(User u) {
		String sql = "insert into userinfo values(null, ?, ?)";
		jt.update(sql, u.getName(), u.getAddr());
		
	}

	@Override
	public void delete(Integer id) {
		String sql = "delete from userinfo where id = ?";
		jt.update(sql, id);
	}

	@Override
	public void update(User u) {
		String sql = "update userinfo set name = ?, addr = ? where id = ?";
		jt.update(sql, u.getName(), u.getAddr());
	}

	@Override
	public User getById(Integer id) {
		String sql = "select * from userinfo where id = ?";
		return jt.queryForObject(sql, new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setAddr(rs.getString("addr"));
				return u;
			}
			
		});
	}

	@Override
	public int getTotalCount() {
		String sql = "select count(*) from t_user  ";
		Integer count = jt.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public List<User> getAll() {
		String sql = "select * from t_user  ";
		List<User> list = jt.query(sql, new RowMapper<User>(){
			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				return u;
			}});
		return list;
	}
	

}
