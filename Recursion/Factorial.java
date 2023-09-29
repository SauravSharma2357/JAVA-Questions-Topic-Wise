package Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		System.out.println(Fact(N));
	}
	public static int Fact (int n) {
		if(n==1) {
			return 1;
		}
		int fn=Fact(n-1);
		return fn*n;
	}
}
