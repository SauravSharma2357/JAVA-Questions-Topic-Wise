package Binary_Search;

import java.util.Scanner;

public class Search_Item {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=kc.nextInt();
		}
		int item = kc.nextInt();
		System.out.println(Search(arr,item));
	}
	public static int Search(int[] arr,int item) {
		int si=0;
		int ei=arr.length-1;
		while(si<=ei) {
			int mid=(si+(ei-si)/2);
			System.out.println(mid);
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				ei=mid-1;
			}
			else {
				si=mid+1;
			}
		}
		return -1;
	}

}
