package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.ers.ERS_Reimbursement;



public interface ERS_Reimbursement_Dao {
	List<ERS_Reimbursement> getAllReimbursements();
	
	ERS_Reimbursement_Dao getReimbursmentByUsername(String username);
	
	void createUser(ERS_Reimbursement_Dao u) throws SQLException;
	
	void updateUser(ERS_Reimbursement_Dao u);
	
	void deleteUser(ERS_Reimbursement_Dao u);
}
