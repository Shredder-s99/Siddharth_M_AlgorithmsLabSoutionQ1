package com.greatLearning.service;

import com.greatLearning.model.currency;
import com.greatLearning.model.mergeSort;

import java.util.Scanner;

public class driver {
	public static void main(String[] args){
		int size;
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		size = s1.nextInt();
		currency c1= new currency(size);
		c1.getCurrencyDenominations();
		System.out.println("Enter the amount you want to pay");
		c1.setAmount_to_pay(s1.nextInt());
		c1.printCurrencyDenominations();

	}



}
