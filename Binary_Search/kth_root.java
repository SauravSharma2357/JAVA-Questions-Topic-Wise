package Binary_Search;

import java.util.Scanner;

public class kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int K = kc.nextInt();
		int N = kc.nextInt();
		System.out.println(KthRoot(K,N));
	}
	public static int KthRoot (int k, int n) {
		int si =0;
		int ei =n;
		int ans =0;
		while(si<=ei) {
			int mid = si+((ei-si)/2);
			if(Math.pow(mid, k)<=n) {
				ans= mid;
				si=mid+1;
			}
			else {
				ei=mid-1;
			}
		}
		return ans;
	}

}
