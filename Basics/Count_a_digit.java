package Basics;

import java.util.Scanner;

public class Count_a_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int item = kc.nextInt();
		int count=0;
		while(N!=0) {
			int rem=N%10;
			if(rem==item) {
				count++;
			}
			N=N/10;
		}
		System.out.println(count);
	}

}
