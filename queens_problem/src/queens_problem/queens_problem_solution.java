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
			long time = System.currentTimeMillis();
			Chess board = new Chess(size, row, column);
			long time2 = System.currentTimeMillis();
			board.board.print();
			System.out.println("Queens: " + board.board.counter_queens + " Time: " + ((time2 - time)/(360)) + " c");
			System.out.print("If you want continue press 1");
			yes = scanner.nextByte();
			
		}
	}
}
