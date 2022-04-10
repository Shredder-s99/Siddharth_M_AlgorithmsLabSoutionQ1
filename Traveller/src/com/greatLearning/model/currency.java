package com.greatLearning.model;

import java.util.Scanner;

public class currency {


	int amount_to_pay;
	Scanner getData= new Scanner(System.in);
	int[] currency_list;
	int[] print_currency_list;
	public currency(int size){
		currency_list = new int[size];
		print_currency_list = new int[size];
	}

	public void setAmount_to_pay(int amount_to_pay) {
		this.amount_to_pay = amount_to_pay;
	}

	private void sort(){
		int temp;
		for(int i=0;i<currency_list.length;i++){
			for (int j=i+1;j<currency_list.length;j++){
				if(currency_list[i]>currency_list[j]){
					temp = currency_list[i];
					currency_list[i]=currency_list[j];
					currency_list[j]=temp;
				}
			}
		}
	}

	public void getCurrencyDenominations(){
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<currency_list.length;i++){
			currency_list[i]=getData.nextInt();
			print_currency_list[i]=0;
		}
		sort();
	}

	public void printCurrencyDenominations(){
       for(int i= currency_list.length-1;i>-1;i--){
		   while(amount_to_pay >= currency_list[i] && amount_to_pay>0)
		   {
			   print_currency_list[i]++;
			   amount_to_pay-=currency_list[i];
		   }
	   }
	   System.out.println("Your payment approach in order to give min no of notes will be");
	   for(int i=currency_list.length-1;i>-1;i--){
		   if(print_currency_list[i]!=0){
			   System.out.println(currency_list[i]+" : "+print_currency_list[i]);
		   }

	   }
	}


}
