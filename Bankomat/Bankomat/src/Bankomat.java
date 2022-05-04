import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int kontostand = 0;
        int price = 2;
        boolean isoff = false;
        System.out.println("Willkommen am Bankomat was wollen se machen:");
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Ausrauben");
        System.out.println("5. Beenden");
        while (!isoff) {
            Scanner scanner = new Scanner(System.in);
            int auswahl = scanner.nextInt();

            if (auswahl == 1) {
                System.out.println("Wie viel Geld möchten Sie einzahla?");
                int einb = scanner.nextInt();
                kontostand = kontostand + einb;
                System.out.println("Geld erfolgreich eingezahlt!");
            }
            if (auswahl == 2) {
                System.out.println("Wie viel Geld möchten Sie abheben?");
                int einb = scanner.nextInt();
                System.out.println("Sind Sie sich wirklich sicher?");
                System.out.println("1. Nein");
                System.out.println("2. Nein aber Nein");
                int confirm = scanner.nextInt();
                if (confirm == 1) {
                    kontostand = kontostand - einb;
                    System.out.println("Hier haben Sie ihr Geld!");
                }
                if (confirm == 2) {
                    System.out.println("Gute Entscheidung!");
                }
            }
            if (auswahl == 3) {
                System.out.println("Ihr Kontostand beträgt " + kontostand + "€");
                if (kontostand < 100) {
                    System.out.println("Das ist ziemlich wenig Geld brauchen Sie Hilfe?");
                } else if (kontostand == 150) {
                    System.out.println("Immerhin reichts für einen Monat");
                }
            }
            if (auswahl == 4) {
                System.out.println("Das ist aber nicht nett sind Sie sich sicher?");
                System.out.println("1 Ja gib das Geld her");
                System.out.println("2 Hab mich umentschieden");
                int auswahhl = scanner.nextInt();
                if (auswahhl == 1) {
                    System.out.println("Bankraub ist Illegal, Kontostand auf 0");
                    kontostand = 0;
                    isoff = true;
                }
                if (auswahhl == 2) {
                    System.out.println("Passt gut, da hast du dein Geld");
                    kontostand = kontostand - price;
                }
            }
            if (auswahl == 5) {
                System.out.println("Auf wieder sehen!");
                isoff = true;
            }
        }
    }
}
