package com.capgemini.anonymousclassexample;

public class LambdaExpressionForUserDefinedFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplication m = () -> {
			System.out.println("Multiplication of two numbers: " + (12*76));
		};
		
		m.mul();

	}

}
