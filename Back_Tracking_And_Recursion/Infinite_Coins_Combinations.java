package Back_Tracking_And_Recursion;

import java.util.Scanner;

public class Infinite_Coins_Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int Amt = kc.nextInt();
		int N = kc.nextInt();
		int[] coins = new int[N];
		for (int i = 0; i < coins.length; i++) {
			coins[i] = kc.nextInt();
		}
		Combinations(coins, Amt, "", 0);
	}

	public static void Combinations(int[] coins, int amt, String ans, int idx) {
		if (amt == 0) {
			System.out.print(ans + " ");
			return;
		}
		for (int i = idx; i < coins.length; i++) {
			if (amt >= coins[i]) {
				Combinations(coins, amt - coins[i], ans + coins[i], i);
			}
		}
	}

}
