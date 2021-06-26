package queens_problem;
import java.util.Scanner;
import java.util.Vector;
public class Chess {
	public Chess_board_and_queens  board;
	int mandatoryColumn;
	int mandatoryRow;
	int here = 0;
	int here2 = 0;
	
	public Chess(int size, int mandatoryRow, int mandatoryColumn) {
		
		this.mandatoryRow = Math.min(mandatoryRow, size - 1);
		this.mandatoryColumn = Math.min(mandatoryColumn, size - 1);
		board = new Chess_board_and_queens(size);
		solution();
	}
	private void solution() {
		board.mark(this.mandatoryRow, this.mandatoryColumn);
		int start_row, start_column, counter_queens, size;
		start_row = start_column = 0;
		size = this.board.size;
		do {
			here = 0;
			here2 = 0;
			Chess_board_and_queens temp_board = new Chess_board_and_queens(size);
			temp_board.mark(mandatoryRow, mandatoryColumn);
			counter_queens = temp_board.counter_queens;
			counter_queens = temp_board.counter_queens;
			if(start_row == 3 && start_column == 2) {
				here++;
				here--;
			}
			find_solution(temp_board,start_row, start_column);
			counter_queens = temp_board.counter_queens;
			start_column++;
			if(start_column == size) {
				start_column = 0;
				start_row++;
			}
			
			if(counter_queens == size) {
				copy_matrix(temp_board.chess_board, board.chess_board, size);
				this.board.counter_queens = counter_queens;
				System.out.println("Row: " + start_row +  " Column: " + (start_column-1));
				break;
			}
		}while(start_row < size);
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
					board.mark(i,j);
					here++;
				}
			}
		}
		for(int i = 0; i < board.size; ++i) {
			for(int j = 0; j < board.size; ++j) {
				if(i == start_row && j == start_column) {
					return;
				}
				if(board.chess_board[i][j] == ' ') {
					board.mark(i,j);
					here2++;
				}
			}
			
		}
	}
}
