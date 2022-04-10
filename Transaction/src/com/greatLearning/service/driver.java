package com.greatLearning.service;

import com.greatLearning.model.dailyTransaction;

import java.util.Scanner;

public class driver {
	public static void main(String[] args) {
		Scanner getData = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of transaction array");
		size = getData.nextInt();
		dailyTransaction t1 = new dailyTransaction(size);
		t1.getArrayData();
		t1.getNumberOfTargets();
	}
}
