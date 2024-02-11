import java.util.Scanner;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = new char[9][9];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Sudoku puzzle row by row. Use '.' for empty cells. Example format: \"5 3 . . 7 . . . .\"");
        for (int i = 0; i < 9; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            
            // Use scanner.next() to read individual values separated by spaces
            for (int j = 0; j < 9; j++) {
                board[i][j] = scanner.next().charAt(0);
            }
        }

        Sudoku sudokuSolver = new Sudoku();
        sudokuSolver.solveSudoku(board);

        System.out.println("Solved Sudoku:");
        printBoard(board);
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
