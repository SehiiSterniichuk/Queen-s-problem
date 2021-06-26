package queens_problem;

import java.util.Scanner;
import java.util.Vector;

public class queens_problem_solution {
	public static void main(String[] args) throws java.io.IOException{
		int size, row, column;
		Scanner scanner = new Scanner(System.in);
		byte yes = 1;
		while(yes == 1) {
			System.out.print("Enter size: ");
			size = scanner.nextInt();
			System.out.print("Enter row: ");
			row = scanner.nextInt();
			System.out.print("Enter column: ");
			column = scanner.nextInt();
			Chess board = new Chess(size, row, column);
			board.board.print();
			System.out.print("If you want continue press 1");
			yes = scanner.nextByte();
			
		}
		

		
		
	}
}
