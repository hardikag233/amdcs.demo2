package com.training.adi;

public class CheckingAccount implements Account{

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 0.04;
	}

	@Override
	public double calcInterest(double amount) {
		// TODO Auto-generated method stub
		return amount*0.04;
	}

}
