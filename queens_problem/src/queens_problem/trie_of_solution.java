package queens_problem;

public class trie_of_solution {
	Chess_board_and_queens data;
	private static Chess_board_and_queens successful_leaf;
	static boolean success = false;
	int level = 0;
	private trie_of_solution(Chess_board_and_queens data, int level) {
		this.data = data;
		this.level = level;
		if(level == 0) {
			success = false;
		}
		if(level < data.size){
			make_children();
		}
	}
	public trie_of_solution(Chess_board_and_queens data) {
		this(data, 0);
		
	}
	private void make_children() {
		boolean new_row = true; 
		for(int col = 0; col < data.size && (success == false); ++col) {
			if(data.chess_board[level][col] == ' ') {
				Chess_board_and_queens child_data = new Chess_board_and_queens(data.size);
				Chess.copy_matrix(data.chess_board, child_data.chess_board, data.size);
				child_data.counter_queens = data.counter_queens;
				child_data.mark(level, col);
				if(child_data.counter_queens == data.size){
					successful_leaf = child_data;
					success = true;
					return;
				}
				if(level < data.size - 1) {
					trie_of_solution child = new trie_of_solution(child_data, (1 + level));
				}
				new_row = false;
			}
			if(new_row == true && col == data.size - 1 && level < data.size - 1) {
				level++;
				col = 0;
			}
		}
	}
	public Chess_board_and_queens successful_leaf() {
		if(success == true) {
			return successful_leaf;
		}
		return this.data;
	}
}
