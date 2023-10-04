package Basics;

import java.util.Scanner;

public class Sum_Of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int sum=0;
		while(N!=0) {
			int rem = N%10;
			sum = sum+rem;
			N=N/10;
		}
		System.out.println(sum);
	}

}
