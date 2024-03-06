public class Board {

    char[][] boardarray = new char[6][7]; // Use 'boardarray' as the variable name, following Java naming conventions.
    char player = 'x';
    // Constructor
    public Board() {
        for (int row = 0; row < boardarray.length; row++) {
            for (int col = 0; col < boardarray[row].length; col++) {
                boardarray[row][col] = ' '; // Initialize each spot with a space character
            }
        }
    }

    public void printBoard() {
        for (int row = 0; row < boardarray.length; row++) {
            for (int col = 0; col < boardarray[row].length; col++) {
                if (col != 0)
                    System.out.print("|"); // Changed to print a vertical bar for better visual separation
                System.out.print(boardarray[row][col]);
            }
            System.out.println();
        }
    }
    public void updateBoard(int column, char currentPlayer){
        for (int row = boardarray.length - 1; row >= 0; row--) {
            if (boardarray[row][column] == ' ') {
                boardarray[row][column] = currentPlayer;
                currentPlayer = (currentPlayer == 'x') ? 'o' : 'x';
                return; 
            }
        }
    }
    public static void main(String[] args) {
        Board gameBoard = new Board(); // Creating an instance of the Board class
        gameBoard.printBoard(); // Calling the printBoard method to display the initial game board
    }
}
