package Recursion;

import java.util.Scanner;

public class Array_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int item = kc.nextInt();
		int[] arr = new int[N];
		for(int i =0;i<arr.length;i++) {
			arr[i]=kc.nextInt();
		}
		System.out.println(ArraySearch(arr,item,0));
	}
	public static int ArraySearch(int[] arr, int item, int i) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		return ArraySearch(arr,item,i+1);
	}

}
