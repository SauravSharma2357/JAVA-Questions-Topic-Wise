package Recursion;

import java.util.Scanner;

public class Monkey_and_Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int T = kc.nextInt();
		System.out.println(Monkey(N,T,0,""));
	}
	public static int Monkey(int n, int t, int curr, String ans) {
		if(curr>t) {
			return 0;
		}
		if(curr==t) {
			System.out.println(ans+" ");
			return 1;
		}
		int count=0;
		for(int dice=1;dice<=n;dice++) {
			count=count+Monkey(n,t,curr+dice,ans+dice);
		}
		return count;
	}

}
