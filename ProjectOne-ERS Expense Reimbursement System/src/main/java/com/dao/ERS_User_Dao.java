package com.dao;

import java.sql.SQLException;
import java.util.List;
import com.ers.ERS_User;

public interface ERS_User_Dao {
	List<ERS_User> getAllUsers();
	
	ERS_User_Dao getUserByUsername(String username);
	
	void createUser(ERS_User_Dao u) throws SQLException;
	
	void updateUser(ERS_User_Dao u);
	
	void deleteUser(ERS_User_Dao u);
}
