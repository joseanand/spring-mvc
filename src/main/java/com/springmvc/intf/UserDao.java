/**
 * 
 */
package com.springmvc.intf;

import com.springmvc.model.Auth;
import com.springmvc.model.User;

/**
 * @author jose
 *
 */
public interface UserDao {

	void register(User user);
	
	User validateUser(Auth auth);
}
