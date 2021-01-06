package MyTicTacToeGame;

public class App {

    public static void main(String[] args) {
        //printing the gameBoard
        printGameBoard(PlayerPlacement.gameBoard);
        //Asking the user for where to put
        System.out.println("Chose your placement by using numbers from 1 to 9:");
        int thePosition = PlayerPlacement.position;
        //making the object of Placement
        int position = PlayerPlacement.setPosition(thePosition);
        PlayerPlacement.placePieceDoWhile();
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println(" ");
        }
    }

}
