import java.time.LocalDate;
import java.util.Scanner;

public class DisplayHandler {
    static void afficherMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Créer une facture");
        System.out.println("2. Créer un devis");
        System.out.println("0. Quitter");
    }

    static void traiterDocument(Scanner scanner, FacturationService service, boolean facture) {
        double montantHT = lireDoublePositif(scanner, "Montant HT : ");

        if (facture) {
            System.out.print("Nom du client : ");
            String client = scanner.nextLine().trim();
            service.creerFacture(montantHT, client);
        } else {
            service.creerDevis(montantHT);
        }
    }

    static int lireEntier(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            try {
                int valeur = Integer.parseInt(scanner.nextLine().trim());
                return valeur;
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre entier valide.");
            }
        }
    }

    private static double lireDoublePositif(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            try {
                double valeur = Double.parseDouble(scanner.nextLine().trim());
                if (valeur < 0) {
                    System.out.println("Le montant doit être positif.");
                } else {
                    return valeur;
                }
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide (ex: 123.45).");
            }
        }
    }

    static public void clientInfo(String clientName, double montantHT, double tva, double total) {
        System.out.println("\n--- FACTURE ---");
        System.out.println("Date : " + LocalDate.now());
        System.out.println("Client : " + clientName);
        System.out.println("Montant HT : " + montantHT);
        System.out.println("TVA : " + tva);
        System.out.println("Total TTC : " + total);
    }

    static public void quotationInfo(double montantHT, double tva, double total) {
        System.out.println("\n--- DEVIS ---");
        System.out.println("Date : " + LocalDate.now());
        System.out.println("Montant HT : " + montantHT);
        System.out.println("TVA : " + tva);
        System.out.println("Total TTC : " + total);
        System.out.println("Valable 30 jours");
    }
}
