import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class SavingHandler {
    public static void savingBill(String clientName, double montantHT, double tva, double total) {
        try (FileWriter writer = new FileWriter("factures.txt", true)) {
            writer.write("FACTURE | " + LocalDate.now()
                    + " | Client=" + clientName
                    + " | HT=" + montantHT
                    + " | TVA=" + tva
                    + " | TTC=" + total + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void savingQuotation(double montantHT, double tva, double total) {
        try (FileWriter writer = new FileWriter("devis.txt", true)) {
            writer.write("DEVIS | " + LocalDate.now()
                    + " | HT=" + montantHT
                    + " | TVA=" + tva
                    + " | TTC=" + total
                    + " | validite=30j\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
