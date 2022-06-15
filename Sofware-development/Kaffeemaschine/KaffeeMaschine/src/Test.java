
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int CoffeeSize = 0;
        int CoffeeStrength = 0;
        int WaterLevel = 0;
        int BeanLevel = 0;
        boolean isoff = false;
        boolean status = false;

        System.out.println("Guten Tag, was möchten Sie machen ?");
        System.out.println("1. Die Maschine Einschalten");
        System.out.println("2. Die Kaffegröße wählen");
        System.out.println("3. Die Stärke des Kaffes wählen");
        System.out.println("4. Das Wasser nachfüllen");
        System.out.println("5. Die Bohnen nachfüllen");
        System.out.println("6. Den Kaffe rauslassen");
        System.out.println("7. Die Kaffeemaschine Ausschalten");
        while (!isoff) {
            Scanner scanner = new Scanner(System.in);
            int auswahl = scanner.nextInt();

            if (auswahl == 1) {
                System.out.println("Die Kaffemaschine wurde gestartet");
                status = true;
            }
            if (auswahl == 2) {
                System.out.println("Schreiben Sie die gewünschte Kaffegröße. 40 bis 200 ml möglich.");
                CoffeeSize = scanner.nextInt();
                System.out.println("Kaffegröße " + CoffeeSize + "ml wurde gewählt");
            }
            if (auswahl == 3) {
                System.out.println("Wie stark soll der Kaffee sein? 1-10");
                CoffeeStrength = scanner.nextInt();
                System.out.println("Kaffee mit der Stärke " + CoffeeStrength + " wurde gewählt");
            }
            if (auswahl == 4) {
                System.out.println("Wasser erfolgreich nach gefüllt!");
                WaterLevel = 1000;
                System.out.println("Wasserfüllstand beträgt wieder " + WaterLevel + "ml.");
            }
            if (auswahl == 5) {
                System.out.println("Bohnen wurden erfolgreich nachgefüllt!");
                BeanLevel = 100;
                System.out.println("Bohnenfüllstand beträgt wieder " + BeanLevel);
            }
            if (auswahl == 6) {
                if (status == true && WaterLevel >= 20 && BeanLevel >= 2) {
                    System.out.println("Kaffe mit " + CoffeeSize + "ml wurde rausgelassen");
                    WaterLevel = WaterLevel - CoffeeSize;
                    BeanLevel = BeanLevel - CoffeeStrength;
                } else if (WaterLevel < CoffeeSize) {
                    System.out.println("Bitte zuerst Wasser nachfüllen");
                } else if (BeanLevel < CoffeeStrength) {
                    System.out.println("Zu wenig Kaffeebohnen, bitte füllen Sie Kaffebohnen nach!");

                } else if (status == false) {
                    System.out.println("Bitte schalten Sie die Maschine ein, bevor Sie etwas anderes ausüben.");

                }

            }
            if (auswahl == 7) {
                System.out.println("Schönen Tag!");
                isoff = true;
            }
        }
    }
}