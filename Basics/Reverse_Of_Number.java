package Basics;

import java.util.Scanner;

public class Reverse_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int sum=0;
		while(N!=0) {
			int rem=N%10;
			sum=(sum*10)+rem;
			N=N/10;
		}
		System.out.println(sum);
	}

}
