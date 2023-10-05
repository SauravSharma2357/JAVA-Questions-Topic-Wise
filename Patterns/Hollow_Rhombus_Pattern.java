package Patterns;

import java.util.*;

public class Hollow_Rhombus_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int star = N;
		int row = 1;
		int space = N-1;
		while(row<=N) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				if(j==1 || j==N) {
					System.out.print("* ");
				}
				else if(row==1 || row ==N) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				j++;
			}
			System.out.println();
			row++;
			space--;
		}
	}

}
