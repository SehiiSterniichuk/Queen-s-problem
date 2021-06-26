package queens_problem;

public class Chess_board_and_queens {
	public char  chess_board[][];
	int counter_queens = 0;
	int size;
	public Chess_board_and_queens(int size)
	{
		this.size = size;
		this.chess_board = new char[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++)
				chess_board[i][j] = ' ';
		}
	}
	public void mark(int row, int column)
	{	
		chess_board[row][column] = 'Q';
		for(int i = 0; i < size; i++) {
			if(i != row)
				chess_board[i][column] = '.';
		}
		for(int i = 0; i < size; ++i) {
			if(i != column)
				chess_board[row][i] = '.';
		}
		for(int i = row - 1, j = column - 1; i >= 0 && j >= 0; --i, --j)
			chess_board[i][j] = '.';
		for(int i = row + 1, j = column + 1; i < size && j < size; ++i, ++j)
			chess_board[i][j] = '.';
		for(int i = row + 1, j = column - 1; i < size && j >= 0; ++i, --j) 
			chess_board[i][j] = '.';
		for(int i = row - 1, j = column + 1; i >= 0 && j < size; --i, ++j) 
			chess_board[i][j] = '.';
		counter_queens++;
		
	}
	public void print() {
		System.out.print("\t");
		for(int i = 0; i < size; ++i )
			System.out.print(i);
		System.out.println();
		for(int i = 0; i < size; ++i) {
			System.out.print(i + "\t");
			for(int j = 0; j < size; ++j) {
				System.out.print(chess_board[i][j]);
			}
			System.out.println();
		}
	}
}
