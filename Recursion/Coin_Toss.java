package Recursion;

import java.util.Scanner;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		CoinToss(N,"");
	}
	public static void CoinToss(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		CoinToss(n-1,ans+"H");
		CoinToss(n-1,ans+"T");
	}

}
