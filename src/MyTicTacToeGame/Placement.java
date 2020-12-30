package MyTicTacToeGame;

import java.util.Scanner;

public class Placement {
    public static char[][] gameBoard = {
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
    };
    public static Scanner scan;
    public static int position;

    public static int getPosition() {
        return position;
    }

    public static int setPosition(int position) {
        Placement.position = position;
        return position;
    }

    public static void placePiece(char[][] gameBoard, int pos, String user) {
        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
        } else if (user.equals("cpu")) {
            symbol = 'O';
        }
        switch (position) {
            case 1:
//                if (board.gameBoard[0][0] == symbol) {
//               System.out.println("THIS PLACEMENT IS USED...");
//                    System.out.println("CHOSE ANOTHER ONE");
//                } else
                gameBoard[0][0] = symbol;
                break;
            case 2:
//                if (board.gameBoard[0][2] == symbol) {
//                    System.out.println("THIS PLACEMENT IS USED...");
//                    System.out.println("CHOSE ANOTHER ONE");
//                } else
                gameBoard[0][2] = symbol;
                break;
            case 3:
//                if (board.gameBoard[0][4] == symbol) {
//                    System.out.println("THIS PLACEMENT IS USED...");
//                    System.out.println("CHOSE ANOTHER ONE");
//                } else
                gameBoard[0][4] = symbol;
                break;
            case 4:
//                if (board.gameBoard[2][0] == symbol) {
//                    System.out.println("THIS PLACEMENT IS USED...");
//                    System.out.println("CHOSE ANOTHER ONE");
//                } else
                gameBoard[2][0] = symbol;
                break;
            case 5:
//                if (board.gameBoard[2][2] == symbol) {
//                    System.out.println("THIS PLACEMENT IS USED...");
//                    System.out.println("CHOSE ANOTHER ONE");
//                } else
                gameBoard[2][2] = symbol;
                break;
            case 6:
//                if (board.gameBoard[2][4] == symbol) {
//                    System.out.println("THIS PLACEMENT IS USED...");
//                    System.out.println("CHOSE ANOTHER ONE");
//                } else
                gameBoard[2][4] = symbol;
                break;
            case 7:
//                if (board.gameBoard[4][0] == symbol) {
//                    System.out.println("THIS PLACEMENT IS USED...");
//                    System.out.println("CHOSE ANOTHER ONE");
//                } else
                gameBoard[4][0] = symbol;
                break;
            case 8:
//                if (board.gameBoard[4][2] == symbol) {
//                    System.out.println("THIS PLACEMENT IS USED...");
//                    System.out.println("CHOSE ANOTHER ONE");
//                } else
                gameBoard[4][2] = symbol;
                break;
            case 9:
//                if (board.gameBoard[4][4] == symbol) {
//                    System.out.println("THIS PLACEMENT IS USED...");
//                    System.out.println("CHOSE ANOTHER ONE");
//                } else
                gameBoard[4][4] = symbol;
                break;
            default:
                System.out.println("INVALID NUMBER");
                System.out.println("CHOSE ANOTHER ONE");
        }
        App.printGameBoard(gameBoard);
    }
}
