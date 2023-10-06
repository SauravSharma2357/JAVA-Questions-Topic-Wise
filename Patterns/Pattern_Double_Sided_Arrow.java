package Patterns;

import java.util.*;

public class Pattern_Double_Sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int num=1;
		int row=1;
		int space1=N-1;
		int space2=-1;
		while(row<=N) {
			int i=1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int val =num;
			while(j<=num) {
				System.out.print(val+" ");
				val--;
				j++;
			}
			int k=1;
			while(k<=space2) {
				System.out.print("  ");
				k++;
			}
			int l=1;
			if(row==1 || row==N) {
				l=2;
			}
			while(l<=num) {
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
			if(row<(N/2)+1) {
				space1-=2;
				space2+=2;
				num++;
			}
			else {
				space1+=2;
				space2-=2;
				num--;
			}
			row++;
		}
	}

}
