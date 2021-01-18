package MyTicTacToeGame;

import java.util.Scanner;

public class App {
    public static Scanner scan = new Scanner(System.in);
    public static String user1 = "";
    public static String user2 = "";
    public static char[][] theGameBoard = {};
    public static int mamij = 0;

    public static void main(String[] args) {
        boolean yeaBoi = true;
        do {
            if (mamij < 9) {
                String modelOfGameBoard = "";
                //Model of the game Board
                System.out.println("Which form of game board you want to use?");
                System.out.println();
                gameBoardChooser(modelOfGameBoard);
                if (mamij < 9) {
                    //user name
                    userName();
                    //Asking the user for where to put
                    System.out.println("Choose your placement by using numbers from 1 to 9:");
                    //printing the gameBoard
                    printGameBoard(theGameBoard);
                    int thePosition = PlayerPlacement.position;
                    //making the object of Placement
                    int position = PlayerPlacement.setPosition(thePosition);
                    PlayerPlacement.placePieceDoWhile(user1, user2, theGameBoard);
                } else {
                    yeaBoi = false;
                }
            }else{
                yeaBoi = false;
            }
        } while (yeaBoi);
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
        oneModelOfGameBoard = scan.nextLine();
        if (oneModelOfGameBoard.equalsIgnoreCase("number one") || oneModelOfGameBoard.equals("1") || oneModelOfGameBoard.equalsIgnoreCase("number 1") || oneModelOfGameBoard.equalsIgnoreCase("one")) {
            theGameBoard = PlayerPlacement.gameBoard1;
        } else if (oneModelOfGameBoard.equalsIgnoreCase("number two") || oneModelOfGameBoard.equals("2") || oneModelOfGameBoard.equalsIgnoreCase("number 2") || oneModelOfGameBoard.equalsIgnoreCase("two")) {
            theGameBoard = PlayerPlacement.gameBoard2;
        } else if (mamij == 1 && oneModelOfGameBoard.equalsIgnoreCase("mamij")) {
            System.out.println("I understood you know Mamij...it's better not talking about it HERE.so if you don't mind PLEASE choose a number between 1 & 2");
            mamij = mamij + 1;
            gameBoardChooser(oneModelOfGameBoard);
        } else if (mamij > 1 && oneModelOfGameBoard.equalsIgnoreCase("mamij")) {
            System.out.println("I warned you before and you didn't listen so now get out of HERE");
            mamij = mamij + 9;
        } else if (oneModelOfGameBoard.equalsIgnoreCase("mamij")) {
            System.out.println("Oh...you know Mamij?sorry we can't talk about it HERE...anyway  you should choose a number between 1 & 2.");
            mamij = mamij + 1;
            gameBoardChooser(oneModelOfGameBoard);
        } else {
            System.out.println("please choose a number between 1 & 2");
            gameBoardChooser(oneModelOfGameBoard);
        }
    }

    public static void userName() {
        System.out.println("Enter first player's name (X)...");
        user1 = scan.nextLine();
        if (user1.equalsIgnoreCase("abcdefghijklmnopqrstuvwxys")){
            user1 = "alphabet";
        }
        boolean firstTime = true;
        do {
            String message = (firstTime) ? "Enter second player's name (O)..." : "This name is taken.please choose another one.";
            System.out.println(message);
            user2 = scan.nextLine();
            if (user2.equalsIgnoreCase("abcdefghijklmnopqrstuvwxys")){
                user2 = "alphabet";
            }
            firstTime = false;
        } while (user1.equals(user2));
    }
}
