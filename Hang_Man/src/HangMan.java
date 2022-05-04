
import java.util.Random;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        Random random = new Random();
        int randomnumber = random.nextInt(3);
        System.out.println();
        String[] Worter = { "test", "abc", "wort" };
        String useword = Worter[randomnumber];
        char[] Wort = new char[useword.length()];
        for (int i = 0; i < Wort.length; i++) {
            Wort[i] = useword.charAt(i);
        }

        char[] zen = new char[useword.length()];
        for (int i = 0; i < zen.length; i++) {
            zen[i] = '*';
        }
        String fullword = "";
        boolean iswin = false;

        while (!iswin) {
            char nt = scanner2.next().charAt(0);

            for (int i = 0; i < Wort.length; i++) {
                if (Wort[i] == nt) {
                    zen[i] = Wort[i];
                    System.out.println("Buchstabe gefunden");
                }
            }

            for (int ii = 0; ii < zen.length; ii++) {
                fullword = fullword + zen[ii];
            }

            System.out.println(fullword);
            if (fullword.contains("*")) {
            } else {
                System.out.println("Gratuliere sie haben gewonnen");
                iswin = true;
            }
            fullword = "";
        }
    }
}