package Basics;

import java.util.Scanner;

public class Tabel_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int sum=0;
		int i=1;
		while(i<=10) {
			if((N*i)%4!=0) {
				System.out.println(N*i);
			}
			i++;
		}
	}

}
