import java.util.Scanner;

public class WaschMaschine {

    public static void main(String[] args) {
        int Waschgang = 0;
        boolean isoff = false;
        boolean status = false;
        int waschmittel = 0;

        while (!isoff) {
            System.out.println("Guten Tag, was möchten Sie machen ?");
            System.out.println("1. Einschalten");
            System.out.println("2. Waschgang wählen");
            System.out.println("3. Waschmittel auffüllen");
            System.out.println("4. Waschgang starten");
            System.out.println("5. Ausschalten");

            Scanner scanner = new Scanner(System.in);
            int auswahl = scanner.nextInt();

            if (auswahl == 1) {
                System.out.println("Die Waschmaschine wurde gestartet");
                status = true;
            }
            if (auswahl == 2) {
                System.out.println("Welchen Waschgang möchten Sie machen?");
                System.out.println("0 Waschgang schnell 40 Minuten");
                System.out.println("1 Waschgang mittel 60 Minuten");
                System.out.println("2 Waschgang langsam 120 Minuten");

                int selectWaschgang = scanner.nextInt();
                if (selectWaschgang == 0) {
                    Waschgang = 0;
                    System.out.println("Waschgang schnell ausgewählt");
                }
                if (selectWaschgang == 1) {
                    Waschgang = 0;
                    System.out.println("Waschgang schnell ausgewählt");
                }
                if (selectWaschgang == 2) {
                    Waschgang = 0;
                    System.out.println("Waschgang schnell ausgewählt");
                }
                System.out.println("Der Waschgang  " + Waschgang + "");
            }
            if (auswahl == 3) {
                if (waschmittel <= 100) {
                    waschmittel = waschmittel + 50;
                } else {
                    System.out.println("Waschmittel bereits voll");
                }
                System.out.println("Es sind " + waschmittel + " Liter Waschmittel im Waschtank");
            }
            if (auswahl == 4) {
                if (waschmittel > 0) {
                    if (Waschgang == 0) {
                        System.out.println(
                                "Die Waschmaschine läuft nun mit dem Programm \"Schnell\". Voruassichtliche Dauer: 40 Minuten");
                        waschmittel = waschmittel - 10;
                    }
                    if (Waschgang == 1) {
                        System.out.println(
                                "Die Waschmaschine läuft nun mit dem Programm \"Mittel\". Voruassichtliche Dauer: 60 Minuten");
                        waschmittel = waschmittel - 20;
                    }
                    if (Waschgang == 2) {
                        System.out.println(
                                "Die Waschmaschine läuft nun mit dem Programm \"Langsam\". Voruassichtliche Dauer: 120 Minuten");
                        waschmittel = waschmittel - 40;
                    }
                } else {
                    System.out.println("Kein Waschmittel bitte nachfüllen");
                }
            }
            if (auswahl == 5) {
                System.out.println("Schönen Tag!");
                isoff = true;
            }
        }
    }
}
