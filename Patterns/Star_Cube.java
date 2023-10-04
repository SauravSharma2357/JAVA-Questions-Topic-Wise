package Patterns;

import java.util.Scanner;

public class Star_Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int row=1;
		int star=N;
		while(row<=N) {
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			row++;
		}
	}
}
