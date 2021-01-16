package MyTicTacToeGame;

import java.util.Scanner;

public class PlayerPlacement {
    public static int[] xWinnerPosition = new int[9];
    public static int[] oWinnerPosition = new int[9];
    public static char[][] gameBoard1 = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
    };
    public static char[][] gameBoard2 = {
            {'1', '|', '2', '|', '3'},
            {'-', '+', '-', '+', '-'},
            {'4', '|', '5', '|', '6'},
            {'-', '+', '-', '+', '-'},
            {'7', '|', '8', '|', '9'},
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
            System.out.println(App.user2 + "'s turn");
        } else if (fullPositionsNumber == 0 || fullPositionsNumber == 2 || fullPositionsNumber == 4 || fullPositionsNumber == 6 || fullPositionsNumber == 8) {
            theUser = "player";
            System.out.println(App.user1 + "'s turn");
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
                    if (symbol == 'X') {
                        xWinnerPosition[0] = 1;
                    } else if (symbol == 'O') {
                        oWinnerPosition[0] = 1;
                    }
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
                    if (symbol == 'X') {
                        xWinnerPosition[1] = 2;
                    } else if (symbol == 'O') {
                        oWinnerPosition[1] = 2;
                    }
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
                    if (symbol == 'X') {
                        xWinnerPosition[2] = 3;
                    } else if (symbol == 'O') {
                        oWinnerPosition[2] = 3;
                    }
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
                    if (symbol == 'X') {
                        xWinnerPosition[3] = 4;
                    } else if (symbol == 'O') {
                        oWinnerPosition[3] = 4;
                    }
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
                    if (symbol == 'X') {
                        xWinnerPosition[4] = 5;
                    } else if (symbol == 'O') {
                        oWinnerPosition[4] = 5;
                    }
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
                    if (symbol == 'X') {
                        xWinnerPosition[5] = 6;
                    } else if (symbol == 'O') {
                        oWinnerPosition[5] = 6;
                    }
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
                    if (symbol == 'X') {
                        xWinnerPosition[6] = 7;
                    } else if (symbol == 'O') {
                        oWinnerPosition[6] = 7;
                    }
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
                    if (symbol == 'X') {
                        xWinnerPosition[7] = 8;
                    } else if (symbol == 'O') {
                        oWinnerPosition[7] = 8;
                    }
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
                    if (symbol == 'X') {
                        xWinnerPosition[8] = 9;
                    } else if (symbol == 'O') {
                        oWinnerPosition[8] = 9;
                    }
                }
                break;
            default:
                System.out.println("ERROR:Invalid number");
                System.out.println("Choose another one.");
        }

        App.printGameBoard(gameBoard);
    }

    public static void placePieceDoWhile(String theUser1, String theUser2, char[][] gameBoard) {
        do {
            placePiece(gameBoard, position, theUser);
            WinnerAndLoser.winner();
            if (WinnerAndLoser.xWinner == true) {
                System.out.println(theUser1 + " (X) won!");
                break;
            } else if (WinnerAndLoser.oWinner == true) {
                System.out.println(theUser2 + " (O) won!");
                break;
            } else if (fullPositionsNumber == 9) {
                System.out.println("No winner :(");
                break;
            }
        } while (fullPositionsNumber < 9);
        System.out.println("Do you want to see casts?(type in Yes or No...)");
        String yOrN = scan.next();
        if (yOrN.equalsIgnoreCase("yes")) {
            System.out.println("CAST:");
            System.out.println("Mamij");
            System.out.println("Thanks to:");
            System.out.println("Mamij");
            System.out.println("Animations(while there is no animation):");
            System.out.println("Mamij");
            System.out.println("Every other think you would expect:");
            System.out.println("Mamij");
        }else if(yOrN.equalsIgnoreCase("no")){
            System.out.println("Ok...");
            for (int i = 0; i < 10; i++){
                System.out.println();
            }
            System.out.println("But i'll show it anyway");
            System.out.println("CAST:");
            System.out.println("Mamij");
            System.out.println("Thanks to:");
            System.out.println("Mamij");
            System.out.println("Animations(while there is no animation):");
            System.out.println("Mamij");
            System.out.println("Every other think you would expect:");
            System.out.println("Mamij");
        }else{
            System.out.println("I didn't understand what you said but i'll show it anyway");
            System.out.println("CAST:");
            System.out.println("Mamij");
            System.out.println("Thanks to:");
            System.out.println("Mamij");
            System.out.println("Animations(while there is no animation):");
            System.out.println("Mamij");
            System.out.println("Every other think you would expect:");
            System.out.println("Mamij");
        }
    }
}