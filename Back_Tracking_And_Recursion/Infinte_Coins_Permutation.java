package Back_Tracking_And_Recursion;

import java.util.Scanner;

public class Infinte_Coins_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int Amount = kc.nextInt();
		int N = kc.nextInt();
		int[] coins = new int[N];
		for (int i = 0; i < coins.length; i++) {
			coins[i]=kc.nextInt();
		}
		Permutations(coins,Amount,"");
	}
	public static void Permutations(int[] coins, int amt, String ans) {
		if(amt==0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i =0;i<coins.length;i++) {
			if(amt>=coins[i]) {
				Permutations(coins,amt-coins[i],ans+coins[i]);
			}
		}
	}

}
