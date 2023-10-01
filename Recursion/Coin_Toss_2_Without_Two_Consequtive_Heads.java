package Recursion;

import java.util.*;

public class Coin_Toss_2_Without_Two_Consequtive_Heads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		System.out.println(CoinToss2(N,""));
	}
	public static int CoinToss2(int N, String ans) {
		if(N==0) {
			System.out.println(ans+" ");
			return 1;
		}
		int count=0;
		if(ans.length()==0 || ans.charAt(ans.length()-1) != 'H'){
			count=count+CoinToss2(N-1,ans+"H");
		}
			count=count+CoinToss2(N-1,ans+"T");
			return count;
	}

}
