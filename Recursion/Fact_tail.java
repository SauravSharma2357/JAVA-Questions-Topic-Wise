package Recursion;

import java.util.Scanner;

public class Fact_tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		System.out.println(FactTail(N,1));
	}
	public static int FactTail(int n, int ans) {
		if(n==1) {
			return ans;
		}
		return FactTail(n-1,ans*n);
	}

}
