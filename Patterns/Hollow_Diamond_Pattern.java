package Patterns;

import java.util.Scanner;

public class Hollow_Diamond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int star = (n/2)+1;
		int row=1;
		int space = -1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=star && k!=(n/2)+1) {
				System.out.print("* ");
				k++;
			}
			if(row<=n/2) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			System.out.println();
			row++;
		}
	}

}
