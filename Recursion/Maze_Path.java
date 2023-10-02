package Recursion;

import java.util.Scanner;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int n = kc.nextInt();
		int m = kc.nextInt();
		Maze(n-1,m-1,0,0,"");
	}
	public static void Maze(int er, int ec, int cr, int cc, String ans) {
		if(cr==er && cc==ec) {
			System.out.println(ans);
			return;
		}
		if(cr>er || cc>ec) {
			return;
		}
		Maze(er,ec,cr+1,cc,ans+"V");
		Maze(er,ec,cr,cc+1,ans+"H");
	}

}
