package Strings;

import java.util.Scanner;

public class Count_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner kc = new Scanner(System.in);
			String str = kc.next();
			String str2 = "aeiou";
			char[] arr = str2.toCharArray();
			Good(str, "", arr);
		}

		public static void Good(String str, String ans, char[] arr) {
			int count=0;
			int max=0;
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				for(int j=0;j<arr.length;j++) {
					if(arr[j]==ch) {
						count++;
					}
				}
			}
			System.out.println(count);
	}

}
