package Patterns;

import java.util.*;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int N = kc.nextInt();
		int num=1;
		int row=1;
		int space=N-1;
		int count=1;
		while(row<=(N*2)-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int p=count;
			while(j<=num) {
				System.out.print(p+" ");
				j++;
				if(j<=(num/2)+1) {
					p++;
				}
				else {
					p--;
				}
			}
			System.out.println();
			if(row<=N-1) {
				num+=2;
				space--;
				count++;
			}
			else {
				num-=2;
				space++;
				count--;
			}
			row++;
		}
	}

}
