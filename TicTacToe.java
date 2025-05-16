import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row, column;
        char player = 'X';

        // Create 2D array for tic-tac-toe board
        char[][] board = new char[3][3];
        char ch = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ch++;
            }
        }

        displayBoard(board);

        while (true) {
            System.out.println("Enter a row and column (0, 1, or 2) for player " + player + ":");
            row = in.nextInt();
            column = in.nextInt();

            // Validate input
            if (row < 0 || row > 2 || column < 0 || column > 2) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            // Check if cell is occupied
            if (board[row][column] == 'X' || board[row][column] == 'O') {
                System.out.println("This spot is occupied. Please try again.");
                continue;
            }

            // Place symbol
            board[row][column] = player;
            displayBoard(board);

            // Check for winner
            if (winner(board)) {
                System.out.println("Player " + player + " is the winner!");
                break;
            }

            // Check for draw
            if (!hasFreeSpace(board)) {
                System.out.println("The game is a draw.");
                break;
            }

            // Switch player
            player = (player == 'X') ? 'O' : 'X';
        }

        in.close();
    }

    public static void displayBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j == board[i].length - 1) System.out.print(board[i][j]);
                else System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean hasFreeSpace(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell != 'X' && cell != 'O') {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean winner(char[][] board) {
        return isHorizontalWin(board) || isVerticalWin(board) || isDiagonalWin(board);
    }

    private static boolean isHorizontalWin(char[][] board) {
        for (char[] row : board) {
            if (isWin(row)) return true;
        }
        return false;
    }

    private static boolean isVerticalWin(char[][] board) {
        for (int col = 0; col < 3; col++) {
            char[] column = new char[3];
            for (int row = 0; row < 3; row++) {
                column[row] = board[row][col];
            }
            if (isWin(column)) return true;
        }
        return false;
    }

    private static boolean isDiagonalWin(char[][] board) {
        char[] diag1 = {board[0][0], board[1][1], board[2][2]};
        char[] diag2 = {board[0][2], board[1][1], board[2][0]};
        return isWin(diag1) || isWin(diag2);
    }

    private static boolean isWin(char[] line) {
        return (line[0] == line[1] && line[1] == line[2]) && (line[0] == 'X' || line[0] == 'O');
    }
}

//1 | 2 | 3
//4 | 5 | 6
//7 | 8 | 9
//
//Enter a row and column (0, 1, or 2) for player X:
//0 0
//X | 2 | 3
//4 | 5 | 6
//7 | 8 | 9
//
//...
//
//Player X is the winner!