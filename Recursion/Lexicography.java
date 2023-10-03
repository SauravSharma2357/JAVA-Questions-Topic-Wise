package Recursion;

import java.util.Scanner;

public class Lexicography {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		Lexi(N,0);
	}
	public static void Lexi(int n, int curr) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		int i =0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			Lexi(n,curr*10+i);
		}
	}

}
