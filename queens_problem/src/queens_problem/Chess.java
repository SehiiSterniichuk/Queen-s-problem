package queens_problem;
import java.util.Scanner;
import java.util.Vector;
public class Chess {
	public Chess_board_and_queens  board;
	int mandatoryColumn;
	int mandatoryRow;
	
	public Chess(int size, int mandatoryRow, int mandatoryColumn) {
		
		this.mandatoryRow = Math.min(mandatoryRow, size - 1);
		this.mandatoryColumn = Math.min(mandatoryColumn, size - 1);
		board = new Chess_board_and_queens(size);
		solution();
	}
	private void solution() {
		board.chess_board[this.mandatoryRow][this.mandatoryColumn] = 'Q';
		board.mark(this.mandatoryRow, this.mandatoryColumn);
		
//		Chess_board_and_queens temp = new Chess_board_and_queens(board.size);
//		temp.chess_board[this.mandatoryRow][this.mandatoryColumn] = 'Q';
//		temp.mark(this.mandatoryRow, this.mandatoryColumn);
		
	}
	static void copy_matrix(char matrix_donor[][], char matrix_recepient[][], int demension) {
		for(int i = 0; i < demension; ++i) {
			for(int j = 0; j < demension; ++j) {
				matrix_recepient[i][j] = matrix_donor[i][j];
			}
		}
	}
	private void find_solution(Chess_board_and_queens board, int start_row, int start_column) {
		for(int i = start_row; i < board.size; ++i) {
			for(int j = start_column; j < board.size; ++j) {
				if(board.chess_board[i][j] == ' ') {
					board.chess_board[i][j] = 'Q';
					board.mark(i,j);
					board.counter_queens++;
				}
			}
		}
	}
	
}
