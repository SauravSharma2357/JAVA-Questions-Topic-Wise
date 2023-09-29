package Recursion;

import java.util.Scanner;

public class Fibonacci_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		System.out.println(Fibonacci(N));
	}
	public static int Fibonacci(int N) {
		if(N==1 || N==0) {
			return N;
		}
		int f1 = Fibonacci(N-1);
		int f2 = Fibonacci(N-2);
		return f1+f2;
	}

}
