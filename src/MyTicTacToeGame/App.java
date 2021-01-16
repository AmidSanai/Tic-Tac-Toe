package MyTicTacToeGame;

import java.util.Scanner;

public class App {
    public static Scanner scan = new Scanner(System.in);
    public static String user1 = "";
    public static String user2 = "";
    public static int user1IsFull = 0;
    public static char[][] theGameBoard = {};
    public static void main(String[] args) {
        String modelOfGameBoard = "";
        //Model of the game Board
        System.out.println("Which form of game board you want to use?");
        System.out.println();
        gameBoardChooser(modelOfGameBoard);
        //user name
        userName();
        //Asking the user for where to put
        System.out.println("Chose your placement by using numbers from 1 to 9:");
        //printing the gameBoard
        printGameBoard(theGameBoard);
        int thePosition = PlayerPlacement.position;
        //making the object of Placement
        int position = PlayerPlacement.setPosition(thePosition);
        PlayerPlacement.placePieceDoWhile(user1, user2, theGameBoard);
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println(" ");
        }
    }

    public static void gameBoardChooser(String oneModelOfGameBoard) {
        System.out.println("Number1:");
        System.out.println();
        printGameBoard(PlayerPlacement.gameBoard1);
        System.out.println();
        System.out.println("Number2:");
        System.out.println();
        printGameBoard(PlayerPlacement.gameBoard2);
        System.out.println();
        oneModelOfGameBoard = scan.next();
        if (oneModelOfGameBoard.equalsIgnoreCase("number one") || oneModelOfGameBoard.equals("1") || oneModelOfGameBoard.equalsIgnoreCase("number 1")) {
            theGameBoard = PlayerPlacement.gameBoard1;
        } else if (oneModelOfGameBoard.equalsIgnoreCase("number two") || oneModelOfGameBoard.equals("2") || oneModelOfGameBoard.equalsIgnoreCase("number 2")) {
            theGameBoard = PlayerPlacement.gameBoard2;
        } else {
            System.out.println("please choose a number between 1 & 2");
            gameBoardChooser(oneModelOfGameBoard);
        }
    }

    public static void userName() {

        if (user1IsFull == 0) {
            System.out.println("Enter player one's name (X)...");
            user1 = scan.next();
            user1IsFull++;
            System.out.println("Enter player two's name (O)...");
            user2 = scan.next();
        }else {
            System.out.println("Enter player two's name (O)...");
            user2 = scan.next();
        }
        if (user2.equalsIgnoreCase(user1)) {
            System.out.println("Please choose another name.this name is taken!");
            userName();
        }
    }
}