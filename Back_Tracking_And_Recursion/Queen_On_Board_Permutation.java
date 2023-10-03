package Back_Tracking_And_Recursion;

import java.util.Scanner;

public class Queen_On_Board_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kc = new Scanner(System.in);
		int Board = kc.nextInt();
		int Queens = kc.nextInt();
		boolean[] Bool = new boolean[Board];
		QOB(Bool,Queens,0,"");
	}
	public static void QOB(boolean[] bool, int tq, int qpsf, String ans) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for(int i=0; i<bool.length;i++) {
			if(bool[i]==false) {
				bool[i]=true;
				QOB(bool,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
				bool[i]=false;
			}
		}
	}

}
