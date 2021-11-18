package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ers.ERS_Reimbursement;
import com.ers.ERS_User;
import com.utils.ConnectionUtil;



public class ERS_DaoDB implements ERS_User_Dao, ERS_Reimbursement_Dao {
	
	private ConnectionUtil conUtil = ConnectionUtil.getConnectionUtil();

	@Override
	public List<ERS_User> getAllUsers() {
		// TODO Auto-generated method stub
		List<ERS_User> ERS_User_List = new ArrayList<ERS_User>();
		
		try {
			Connection con = conUtil.getConnection();
			
			String sql = "SELECT * FROM ers_users";
			
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(sql);
			
			while(rs.next()) {
				ERS_User_List.add(new ERS_User(rs.getInt(1), rs.getInt(7), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(2)));
			}
			return ERS_User_List;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ERS_User_Dao getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createUser(ERS_User_Dao u) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(ERS_User_Dao u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(ERS_User_Dao u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ERS_Reimbursement_Dao getReimbursmentByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createUser(ERS_Reimbursement_Dao u) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(ERS_Reimbursement_Dao u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(ERS_Reimbursement_Dao u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ERS_Reimbursement> getAllReimbursements() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
