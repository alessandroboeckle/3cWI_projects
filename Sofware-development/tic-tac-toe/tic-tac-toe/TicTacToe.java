import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("Herzlich wilkommen beim minispiel TicTacToe");
        System.out.println();
        System.out.println("-----------------------------------------------");
        boolean won = false;
        char[][] playingarea = new char[3][3];
        int currentplayer = 1;

        while (!won) {
            System.out.println("Enter your choice Player " + currentplayer);
            String sep = "|";
            for (int i = 0; i < playingarea.length; i++) {
                int r1 = playingarea[i][0];
                int r2 = playingarea[i][1];
                int r3 = playingarea[i][2];

                System.out.println(sep + r1 + sep + r2 + sep + r3 + sep);
            }
            String auswahl = scanner.nextLine();
            String[] auswal = auswahl.split(",");

            if (playingarea[Integer.parseInt(auswal[0])][Integer.parseInt(auswal[1])] > 0) {
                System.out.println("Das Feld wurde bereits gewählt");
            } else {
                if (currentplayer == 1) {
                    playingarea[Integer.parseInt(auswal[0])][Integer.parseInt(auswal[1])] = 1;
                    currentplayer = 2;
                } else if (currentplayer == 2) {
                    playingarea[Integer.parseInt(auswal[0])][Integer.parseInt(auswal[1])] = 2;
                    currentplayer = 1;
                }
            }

            // Win Conditions:

            if ((playingarea[0][0] + playingarea[0][1] + playingarea[0][2]) == 3) {
                won = true;
            } else if ((playingarea[0][0] + playingarea[0][1] + playingarea[0][2]) == 6) {
                won = true;
            } else if ((playingarea[1][0] + playingarea[1][1] + playingarea[1][2]) == 3) {
                won = true;
            } else if ((playingarea[1][0] + playingarea[1][1] + playingarea[1][2]) == 6) {
                won = true;
            } else if ((playingarea[2][0] + playingarea[2][1] + playingarea[2][2]) == 3) {
                won = true;
            } else if ((playingarea[2][0] + playingarea[2][1] + playingarea[2][2]) == 6) {
                won = true;
            } else if ((playingarea[0][0] + playingarea[1][0] + playingarea[2][0]) == 3) {
                won = true;
            } else if ((playingarea[0][0] + playingarea[1][0] + playingarea[2][0]) == 6) {
                won = true;
            } else if ((playingarea[0][1] + playingarea[1][1] + playingarea[2][1]) == 3) {
                won = true;
            } else if ((playingarea[0][2] + playingarea[1][2] + playingarea[2][2]) == 6) {
                won = true;
            } else if ((playingarea[0][0] + playingarea[1][1] + playingarea[2][2]) == 3) {
                won = true;
            } else if ((playingarea[0][2] + playingarea[1][1] + playingarea[2][0]) == 6) {
                won = true;
            } else if ((playingarea[0][0] + playingarea[1][1] + playingarea[2][2]) == 6) {
                won = true;
            } else if ((playingarea[0][2] + playingarea[1][1] + playingarea[2][0]) == 3) {
                won = true;
            }

        }
        if (won == true) {
            if (currentplayer == 1) {
                currentplayer = 2;
            } else {
                currentplayer = 1;
            }
        }
        System.out.println("Gratuliere Spieler Nr " + currentplayer);
    }
}