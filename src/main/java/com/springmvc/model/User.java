/**
 * 
 */
package com.springmvc.model;

/**
 * @author jose
 *
 */
public class User {

	private String username;
	private String password;
	private String firstnm;
	private String lastnm;
	private String email;
	private String address;
	private int phone;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstnm() {
		return firstnm;
	}
	public void setFirstnm(String firstnm) {
		this.firstnm = firstnm;
	}
	public String getLastnm() {
		return lastnm;
	}
	public void setLastnm(String lastnm) {
		this.lastnm = lastnm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
}
