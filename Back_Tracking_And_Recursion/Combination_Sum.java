package Back_Tracking_And_Recursion;

import java.util.*;

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 5};
		int T = 10;
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ll = new ArrayList<>();
		Combinations(arr,T,ll,ans,0);
		System.out.println(ans);
	}
	public static void Combinations(int[] arr, int t, List<Integer> ll, List<List<Integer>> ans, int idx) {
		if(t==0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=idx;i<arr.length;i++) {
			if(t>=arr[i]) {
				ll.add(arr[i]);
				Combinations(arr,t-arr[i],ll,ans,i);
				ll.remove(ll.size()-1);
			}
		}
	}

}
