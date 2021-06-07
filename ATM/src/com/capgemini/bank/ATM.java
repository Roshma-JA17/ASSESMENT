package com.capgemini.bank;

public class ATM {
	String Location;
	String BranchName;
	
	public ATM() {
		
	}
	public ATM(String location, String branchName) {
		super();
		Location = location;
		BranchName = branchName;
	}

	@Override
	public String toString() {
		return "Branch Name : " + BranchName+"\nLocation : " + Location;
	}

}
