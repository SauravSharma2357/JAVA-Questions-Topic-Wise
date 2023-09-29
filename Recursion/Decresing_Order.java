package Recursion;

import java.util.Scanner;

public class Decresing_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		DO(N);
	}
	public static void DO(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		DO(n-1);
	}

}
