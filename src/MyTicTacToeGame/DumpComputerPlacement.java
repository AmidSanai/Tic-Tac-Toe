package MyTicTacToeGame;

import java.util.Random;

public class DumpComputerPlacement {
    public static Random rand = new Random();
    public static int min = 1;
    public static int max = 9;
    public static int randomInt = (int) (Math.random() * (max - min + 1) + min);

    public static void dumbChooser() {
        PlayerPlacement.placePiece(PlayerPlacement.gameBoard1, PlayerPlacement.position, PlayerPlacement.theUser);
    }
}
