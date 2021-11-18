package com.ers;

public class ERS_User {
	int userId;
	int userRoleId;
	String first_name;
	String last_name;
	String username;
	String password;
	String email;
	
	public ERS_User() {}
	
	public ERS_User(int i, int ri, String f, String l, String u, String p, String e) {
		userId = i;
		userRoleId = ri;
		first_name = f;
		last_name = l;
		username = u;
		password = p;
		email = e;
	}
}
