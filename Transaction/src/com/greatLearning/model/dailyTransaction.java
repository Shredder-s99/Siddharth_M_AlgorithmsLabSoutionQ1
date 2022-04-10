package com.greatLearning.model;

import java.util.Scanner;

public class dailyTransaction {
	int number_of_targets;
	Scanner getData = new Scanner(System.in);
	int[] number_of_transactions;
	public dailyTransaction(int size){
		number_of_transactions = new int[size];
		//System.out.println(number_of_transactions.length);
	}
	public void getArrayData(){
		System.out.println("Enter the values of array");
		for(int i=0; i < number_of_transactions.length; i++){
			number_of_transactions[i]=getData.nextInt();
		}
	}
	public void getNumberOfTargets(){
		System.out.println("Enter the total no of targets that needs to be achieved");
		number_of_targets = getData.nextInt();
		int target;
		for(int i=0;i<number_of_targets;i++){
			System.out.println("Enter the value of target");
			target = getData.nextInt();
			checkArrayData(target);
		}
	}

	private void checkArrayData(int target) {
		int sum =0;
		int index=1;
		boolean flag =false;
		for(int i : number_of_transactions){
			sum=sum+i;
			if(sum >= target){
				flag = true;
				System.out.println("Target achieved after "+index+" transactions");
				return;
			}
			index++;
		}
		if(!flag){
			System.out.println("Given target is not achieved");
		}
	}
}
