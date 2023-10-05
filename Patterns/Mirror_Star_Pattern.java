package Patterns;

import java.util.Scanner;

public class Mirror_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int star = 1;
		int space = N/2;
		int row =1;
		while(row<=N) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			if(row<=(N/2)) {
				star+=2;
				space-=1;
			}
			else {
				star-=2;
				space+=1;
			}
			row++;
		}
	}

}
