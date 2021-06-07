package com.capgemini.bank;

public class ATMCard {

	int PIN;
	long CardID;
	Account Acc;
	public ATMCard(int pin, long cardID, Account acc) {
		super();
		PIN = pin;
		CardID = cardID;
		Acc = acc;
	}
	
	public ATMCard(Account acc) {
		Acc=acc;
	}
	
	@Override
	public String toString() {
		return Acc+"\nCard Number : "+CardID;
	}


}
