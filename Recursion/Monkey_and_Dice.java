package Recursion;

import java.util.Scanner;

public class Monkey_and_Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int T = kc.nextInt();
		Monkey(N,T,0,"");
	}
	public static void Monkey(int n, int t, int curr, String ans) {
		if(curr>t) {
			return ;
		}
		if(curr==t) {
			System.out.println(ans+" ");
			return ;
		}
		
		for(int dice=1;dice<=n;dice++) {
			Monkey(n,t,curr+dice,ans+dice);
		}
	}

}
