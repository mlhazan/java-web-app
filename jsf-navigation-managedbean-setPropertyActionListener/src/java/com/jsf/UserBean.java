
package com.jsf;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @jsf version "2.1"
 * @server TomEE 1.7.4
 * @os windows 10
 * @date Oct 24, 2016
 */

@Named(value="user")
@RequestScoped
public class UserBean{

	public String username;

	public String outcome(){
		return "result";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}