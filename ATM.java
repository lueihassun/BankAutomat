import java.util.*;
import java.text.DecimalFormat;

public class ATM {
    // Dezimalstellen auf 2 runden.
    private static final DecimalFormat df = new DecimalFormat("0.00");
    // Scanner-Objekt erstellen. System.in ist ein Standard Input-Stream.
    static Scanner sc = new Scanner(System.in); 
    // Variablen deklarieren.
    static Double abbuchung, guthaben = 136.34;
    public static void main(String[] args) {
        // Methodenaufruf. (5 Durchläufe)
        for (int i = 0; i < 5; i++) {
            CheckeGuthaben();
          }
    }

    public static void CheckeGuthaben() { 
        // Anweisung für Nutzer.
        System.out.println("\n-> Dein aktuelles Guthaben beträgt " + df.format(guthaben) + " Euro.\n" + "\nWie viel Geld willst du abheben?\n");
        // Nutzereingabe auslesen.
        abbuchung = sc.nextDouble();
        // Wenn das Guthaben nach dem Abbuchen negativ ist, dann nichts abheben, sonst abheben und neuen Kontostand anzeigen.
        if (guthaben - abbuchung < 0) {
            // Fehlermeldung anzeigen.
            System.out.println("\n-> Dein Guthaben reicht nicht aus!\n");
        }
        else {
            if (abbuchung > 0) {
                guthaben -= abbuchung;
            }
            else {
                guthaben = 0.0;
            }
        }
    } 
}