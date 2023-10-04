package Basics;

import java.util.Scanner;

public class Tabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int i=1;
		int sum=0;
		while(i<=10) {
			System.out.println(i*N);
			i++;
		}
	}

}
