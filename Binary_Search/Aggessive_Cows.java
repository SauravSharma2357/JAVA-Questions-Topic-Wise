package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Aggessive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int C = kc.nextInt();
		int[] Stalls = new int[N];
		for (int i = 0; i < Stalls.length; i++) {
			Stalls[i] = kc.nextInt();
		}
		Arrays.sort(Stalls);
		System.out.println(MaxD(Stalls,C));
	}
	public static int MaxD(int[] stalls,int c) {
		int si=0;
		int ei=stalls.length-1;
		int ans=0;
		while(si<=ei) {
			int mid =(si+((ei-si)/2));
			if(isitpossible(stalls,mid,c)==true) {
				ans=mid;
				si=mid+1;
			}
			else {
				ei=mid-1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] stalls, int mid,int c) {
		int pos = stalls[0];
		int cow=1;
		for(int i=0; i<stalls.length;i++) {
			if(stalls[i]-pos>=mid) {
				cow++;
				pos=stalls[i];
			}
			if(cow==c) {
				return true;
			}
		}
		return false;
	}

}
