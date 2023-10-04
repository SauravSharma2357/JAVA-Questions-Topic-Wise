package Basics;

import java.util.Scanner;

public class Sum_of_Natural_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int i=1;
		int sum=0;
		while(i<=N) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
