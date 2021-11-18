package com.ers;

public class ERS_Reimbursement {
	int reimbId;
	int reimbStatusId;
	int reimbTypeId;
	double reimbAmount;
	//String reimbSubmitted;
	//String reimbResolved;
	String reimbDescription;
	//?? reimbReciept
	String reimbAuthor;
	String reimbResolver;
	
	public ERS_Reimbursement() {
	}
	
	public ERS_Reimbursement(int i, int si, int ti, double a, String d, String au, String re) {
		reimbId = i;
		reimbStatusId = si;
		reimbTypeId = ti;
		reimbAmount = a;
		reimbDescription = d;
		reimbAuthor = au;
		reimbResolver = re;
	}
}
