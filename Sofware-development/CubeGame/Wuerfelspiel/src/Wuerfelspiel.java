
import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {
    public static void main(String[] args) {
        Random random = new Random();
        int result = 0;
        int result2 = 0;
        int computeradvantage = 5;
        System.out.println("Hallo im Casino, möchten Sie Geld beim Würfeln verlieren");
        System.out.println("1. Ja");
        System.out.println("2. Ja, ich habe eh keine andere Wahl");
        Scanner scanner = new Scanner(System.in);
        int auswahl = scanner.nextInt();

        if (auswahl < 3) {
            for (int i = 1; i < 7; i++) {
                int r = random.nextInt(6) + 1;
                result = result + r;
                int b = random.nextInt(6 + computeradvantage) + 1;
                result2 = result2 + b;
                if (i == 6) {
                    System.out.println("Ihr Ergebniss ist: " + result);
                    System.out.println("Der Computer hat: " + result2);
                    if (result > result2) {
                        System.out.println("Gratuliere Sie haben gewonnen");
                    } else if (result < result2) {
                        System.out.println("Easy! Computer hat gewonnen");
                    }
                }
            }
        }
    }
}
