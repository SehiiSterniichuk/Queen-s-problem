package queens_problem;

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
		board.mark(this.mandatoryRow, this.mandatoryColumn);
		trie_of_solution trie = new trie_of_solution(this.board);
		board = trie.successful_leaf();
	}
	static void copy_matrix(char matrix_donor[][], char matrix_recepient[][], int demension) {
		for(int i = 0; i < demension; ++i) {
			for(int j = 0; j < demension; ++j) {
				matrix_recepient[i][j] = matrix_donor[i][j];
			}
		}
	}
}
