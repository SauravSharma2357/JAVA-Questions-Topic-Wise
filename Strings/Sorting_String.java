package Strings;

import java.util.Scanner;

public class Sorting_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		String str = kc.next();
		char arr[] = str.toCharArray();
		Sort(arr);
	}
	public static void Sort(char arr[]) {
		char temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr);
	}

}
