package MyTicTacToeGame;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Scanner
        Scanner scan = new Scanner(System.in);
        //printing the gameBoard
        printGameBoard(Placement.gameBoard);
        //Asking the user for where to put
        System.out.println("Chose your placement by using numbers from 1 to 9:");
        int thePosition = scan.nextInt();
        //making the object of Placement
        int position = Placement.setPosition(thePosition);
        Placement.placePiece(Placement.gameBoard, position, "player");
    }
    public static void printGameBoard ( char[][] gameBoard){
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println(" ");
        }
    }
}
