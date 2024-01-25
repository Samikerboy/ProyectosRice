import java.util.Scanner;

public class TicTacToe {

    int cols = 3;
    int rows = 3;
    int totalTurns = 0;

    int winner = -1;

    enum GameState {

        OVER, RUNNING

    }

    static GameState currentState = GameState.OVER;

    GridSquare[][] board;

    public void setup() {
        board = new GridSquare[rows][cols];
        int position = 1;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                board[r][c] = new GridSquare(position);
                position++;
            }

        }

        currentState = GameState.RUNNING;
        playGame();

    }

    public void playGame() {
        while (currentState == GameState.RUNNING) {
            displayBoard();
            makeMove();
        }
        if (currentState == GameState.OVER) {
            displayGameOver();
        }
    }
    public void displayBoard() {
        System.out.println(" " + board[0][0].drawSpace() + " | " + board[0][1].drawSpace() + "  | " + board[0][2].drawSpace() + " \n___|____|___\n\n" + " " + board[1][0].drawSpace() + " | " + board[1][1].drawSpace() + "  | " + board[1][2].drawSpace() + " \n___|____|___\n\n" + " " + board[2][0].drawSpace() + " | " + board[2][1].drawSpace() + "  | " + board[2][2].drawSpace() + "\n   |    |   ");
    }

    public void makeMove() {

        System.out.println("Player " + getPlayer() + " choose a pos: ");

        Scanner in = new Scanner(System.in);
        int spot = in.nextInt();

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (board[i][j].state == -1 && board[i][j].pos == spot) {
                    board[i][j].state = totalTurns % 2;
                    totalTurns++;
                }
                checkWin(i, j, board[i][j].state);
            }
        }

    }

    public void displayGameOver() {
        displayBoard();
        System.out.println("Game Over!");

        if (winner == 0) {
            System.out.println("Player 0 Wins");
        }
        if (winner == 1) {
            System.out.println("Player X Wins");
        }
        if (totalTurns == 9) {
            System.out.println("Tie!");
        }

    }
    public void checkWin(int x, int y, int turn) {
        int colWin = 0;
        int rowWin = 0;
        int diag1Win = 0;
        int diag2Win = 0;

        // Check for a win going in every direction

        // for int num to 3
            // Check 3 columns
            // If neighbor matches turn, increase colWin by 1.
            // CHeck 3 squares in row
            // If neighbor matches turn, increase rowWin by 1.
            // CHeck 3 square in diagonal
            // If neighbor matches turn, increase diag1Win by 1.
            // Check 3 squares in 2nd diagonal.
            // If neighbor matches turn, increase diag2Win by 1.
        //If colWin, rowWin, diag1Win, or diag2Win equals 3, set winner to be turn.

        for (int next = 0; next < 3; next++) {
            if (board[x][next].state == turn) {
                colWin++;
            }
            if (board[next][y].state == turn) {
                rowWin++;
            }
            if (board[next][next].state == turn) {
                diag1Win++;
            }
            if (board[next][2 - next].state == turn) {
                diag2Win++;
            }
        }

        if (colWin == 3 || rowWin == 3 || diag1Win == 3 || diag2Win == 3) {
            winner = turn;
            if (winner != -1) {
                currentState = GameState.OVER;
            }

            if (totalTurns == 9) {
                currentState = GameState.OVER;
            }
        }
    }

    public char getPlayer() {
        if (totalTurns % 2 == 0) {
            return 'O';
        }
        return 'X';
    }
}
