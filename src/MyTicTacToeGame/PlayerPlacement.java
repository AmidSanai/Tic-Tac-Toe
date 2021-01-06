package MyTicTacToeGame;

import java.util.Scanner;

public class PlayerPlacement {
    public static char[][] gameBoard = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
    };
    public static Scanner scan = new Scanner(System.in);
    public static int position;
    public static String theUser;

    public static int setPosition(int position) {
        PlayerPlacement.position = position;
        return position;
    }

    public static int fullPositionsNumber = 0;
    public static int one = 0;
    public static int two = 0;
    public static int three = 0;
    public static int four = 0;
    public static int five = 0;
    public static int six = 0;
    public static int seven = 0;
    public static int eight = 0;
    public static int nine = 0;

    public static void userChooser(String fpn) {
        if (fullPositionsNumber == 1 || fullPositionsNumber == 3 || fullPositionsNumber == 5 || fullPositionsNumber == 7) {
            theUser = "computer";
        } else if (fullPositionsNumber == 0 || fullPositionsNumber == 2 || fullPositionsNumber == 4 || fullPositionsNumber == 6 || fullPositionsNumber == 8) {
            theUser = "player";
        }
    }

    public static void placePiece(char[][] gameBoard, int pos, String user) {
        userChooser(theUser);
        user = theUser;
        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
        } else if (user.equals("computer")) {
            symbol = 'O';
        }
        position = scan.nextInt();
        switch (position) {
            case 1:
                if (one == 1) {
                    System.out.println("ERROR:The placement you've chosen is full");
                    System.out.println("Choose another one.");
                } else {
                    gameBoard[0][0] = symbol;
                    fullPositionsNumber = fullPositionsNumber + 1;
                    one = one + 1;
                }
                break;
            case 2:
                if (two == 1) {
                    System.out.println("ERROR:The placement you've chosen is full");
                    System.out.println("Choose another one.");
                } else {
                    gameBoard[0][2] = symbol;
                    fullPositionsNumber = fullPositionsNumber + 1;
                    two = two + 1;
                }
                break;
            case 3:
                if (three == 1) {
                    System.out.println("ERROR:The placement you've chosen is full");
                    System.out.println("Choose another one.");
                } else {
                    gameBoard[0][4] = symbol;
                    fullPositionsNumber = fullPositionsNumber + 1;
                    three = three + 1;
                }
                break;
            case 4:
                if (four == 1) {
                    System.out.println("ERROR:The placement you've chosen is full");
                    System.out.println("Choose another one.");
                } else {
                    gameBoard[2][0] = symbol;
                    fullPositionsNumber = fullPositionsNumber + 1;
                    four = four + 1;
                }
                break;
            case 5:
                if (five == 1) {
                    System.out.println("ERROR:The placement you've chosen is full");
                    System.out.println("Choose another one.");
                } else {
                    gameBoard[2][2] = symbol;
                    fullPositionsNumber = fullPositionsNumber + 1;
                    five = five + 1;
                }
                break;
            case 6:
                if (six == 1) {
                    System.out.println("ERROR:The placement you've chosen is full");
                    System.out.println("Choose another one.");
                } else {
                    gameBoard[2][4] = symbol;
                    fullPositionsNumber = fullPositionsNumber + 1;
                    six = six + 1;
                }
                break;
            case 7:
                if (seven == 1) {
                    System.out.println("ERROR:The placement you've chosen is full");
                    System.out.println("Choose another one.");
                } else {
                    gameBoard[4][0] = symbol;
                    fullPositionsNumber = fullPositionsNumber + 1;
                    seven = seven + 1;
                }
                break;
            case 8:
                if (eight == 1) {
                    System.out.println("ERROR:The placement you've chosen is full");
                    System.out.println("Choose another one.");
                } else {
                    gameBoard[4][2] = symbol;
                    fullPositionsNumber = fullPositionsNumber + 1;
                    eight = eight + 1;
                }
                break;
            case 9:
                if (nine == 1) {
                    System.out.println("ERROR:The placement you've chosen is full");
                    System.out.println("Choose another one.");
                } else {
                    gameBoard[4][4] = symbol;
                    fullPositionsNumber = fullPositionsNumber + 1;
                    nine = nine + 1;
                }
                break;
            default:
                System.out.println("ERROR:Invalid number");
                System.out.println("Choose another one.");
        }

        App.printGameBoard(gameBoard);
    }

    public static void placePieceDoWhile() {
        do {
            placePiece(gameBoard, position, theUser);
        } while (fullPositionsNumber < 9);
    }
}