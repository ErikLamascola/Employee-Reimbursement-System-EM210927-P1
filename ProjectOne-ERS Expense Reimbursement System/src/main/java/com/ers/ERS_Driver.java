package com.ers;

import java.util.List;

import com.dao.ERS_DaoDB;
import com.dao.ERS_User_Dao;

public class ERS_Driver {
	
	public static void main(String[] args) {
	ERS_User_Dao uDao = new ERS_DaoDB();
	
	List<ERS_User> allUsers = uDao.getAllUsers();
	
	System.out.println(allUsers);
	
	}
}