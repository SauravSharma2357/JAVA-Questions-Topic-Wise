package Recursion;

import java.util.Scanner;

public class Power_Tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc =new Scanner(System.in);
		int a = kc.nextInt();
		int b = kc.nextInt();
		System.out.println(Power(a,b,1));
	}
	public static int Power(int a, int b, int ans) {
		if(b==0) {
			return ans;
		}
		return Power(a,b-1,ans*a);
	}

}
