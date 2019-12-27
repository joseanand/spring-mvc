/**
 * 
 */
package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springmvc.intf.UserDao;
import com.springmvc.model.Auth;
import com.springmvc.model.User;

/**
 * @author jose
 *
 */
public class UserDAOImpl implements UserDao {

	@Autowired
	DataSource datasource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void register(User user) {
		String sql = "insert into users values(?,?,?,?,?,?,?)";
	    jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstnm(),
	    user.getLastnm(), user.getEmail(), user.getAddress(), user.getPhone() });
	}

	public User validateUser(Auth auth) {
		String sql = "select * from users where username='" + auth.getUsername() + "' and password='" + auth.getPassword()
	    + "'";
		List<User> users = jdbcTemplate.query(sql, new RowMapper<User>() {

			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setAddress(rs.getString("address"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setFirstnm(rs.getString("firstnm"));
				user.setLastnm(rs.getString("lastnm"));
				user.setPhone(rs.getInt("phone"));
				return user;
			}
			
		});
		return users.size()>0?users.get(0):null;
	}
}
