package MyTicTacToeGame;

public class WinnerAndLoser {
    public static boolean xWinner = false;
    public static boolean oWinner = false;

    public static void xWinner() {
        if (PlayerPlacement.xWinnerPosition[0] == 1 && PlayerPlacement.xWinnerPosition[1] == 2 && PlayerPlacement.xWinnerPosition[2] == 3) {
            xWinner = true;
        } else if (PlayerPlacement.xWinnerPosition[0] == 1 && PlayerPlacement.xWinnerPosition[3] == 4 && PlayerPlacement.xWinnerPosition[6] == 7) {
            xWinner = true;
        } else if (PlayerPlacement.xWinnerPosition[0] == 1 && PlayerPlacement.xWinnerPosition[4] == 5 && PlayerPlacement.xWinnerPosition[8] == 9) {
            xWinner = true;
        } else if (PlayerPlacement.xWinnerPosition[1] == 2 && PlayerPlacement.xWinnerPosition[4] == 5 && PlayerPlacement.xWinnerPosition[7] == 8) {
            xWinner = true;
        } else if (PlayerPlacement.xWinnerPosition[2] == 3 && PlayerPlacement.xWinnerPosition[4] == 5 && PlayerPlacement.xWinnerPosition[6] == 7) {
            xWinner = true;
        } else if (PlayerPlacement.xWinnerPosition[2] == 3 && PlayerPlacement.xWinnerPosition[5] == 6 && PlayerPlacement.xWinnerPosition[8] == 9) {
            xWinner = true;
        } else if (PlayerPlacement.xWinnerPosition[3] == 4 && PlayerPlacement.xWinnerPosition[4] == 5 && PlayerPlacement.xWinnerPosition[5] == 6) {
            xWinner = true;
        } else if (PlayerPlacement.xWinnerPosition[6] == 7 && PlayerPlacement.xWinnerPosition[7] == 8 && PlayerPlacement.xWinnerPosition[8] == 9) {
            xWinner = true;
        }
    }

    public static void oWinner() {
        if (PlayerPlacement.oWinnerPosition[0] == 1 && PlayerPlacement.oWinnerPosition[1] == 2 && PlayerPlacement.oWinnerPosition[2] == 3) {
            oWinner = true;
        } else if (PlayerPlacement.oWinnerPosition[0] == 1 && PlayerPlacement.oWinnerPosition[3] == 4 && PlayerPlacement.oWinnerPosition[6] == 7) {
            oWinner = true;
        } else if (PlayerPlacement.oWinnerPosition[0] == 1 && PlayerPlacement.oWinnerPosition[4] == 5 && PlayerPlacement.oWinnerPosition[8] == 9) {
            oWinner = true;
        } else if (PlayerPlacement.oWinnerPosition[1] == 2 && PlayerPlacement.oWinnerPosition[4] == 5 && PlayerPlacement.oWinnerPosition[7] == 8) {
            oWinner = true;
        } else if (PlayerPlacement.oWinnerPosition[2] == 3 && PlayerPlacement.oWinnerPosition[4] == 5 && PlayerPlacement.oWinnerPosition[6] == 7) {
            oWinner = true;
        } else if (PlayerPlacement.oWinnerPosition[2] == 3 && PlayerPlacement.oWinnerPosition[5] == 6 && PlayerPlacement.oWinnerPosition[8] == 9) {
            oWinner = true;
        } else if (PlayerPlacement.oWinnerPosition[3] == 4 && PlayerPlacement.oWinnerPosition[4] == 5 && PlayerPlacement.oWinnerPosition[5] == 6) {
            oWinner = true;
        } else if (PlayerPlacement.oWinnerPosition[6] == 7 && PlayerPlacement.oWinnerPosition[7] == 8 && PlayerPlacement.oWinnerPosition[8] == 9) {
            oWinner = true;
        }
    }

    public static void winner() {
        oWinner();
        xWinner();
    }
}
