package Back_Tracking_And_Recursion;

public class N_Queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean [][] board = new boolean[n][n];
		QP(board,n,0);
	}
	public static void QP(boolean[][] board, int n, int row) {
		if(n==0) {
			Display(board);
			return;
		}
		for(int col =0;col<board.length;col++) {
			if(isitsafe(board,row,col)==true) {
				board[row][col]=true;
				QP(board,n-1,row+1);
				board[row][col]=false;
			}
		}
	}
	public static boolean isitsafe(boolean[][] board, int row, int col) {
		for(int r = row; r>=0;r--) {
			if(board[r][col]==true) {
				return false;
			}
		}
		
		int r=row;
		int c=col;
		while(r>=0 && c<board.length) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c++;
		}
		
		r=row;
		c=col;
		while(r>=0 && c>=0) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c--;
		}
		return true;
	}
	
	public static void Display(boolean[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

}
