package Recursion;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int a = kc.nextInt();
		int b = kc.nextInt();
		System.out.println(Power(a,b));
	}
	public static int Power(int a, int b) {
		if(b==0) {
			return 1;
		}
		int fn = Power(a,b-1);
		return fn*a;
	}

}
