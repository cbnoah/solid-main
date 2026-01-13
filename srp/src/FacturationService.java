public class FacturationService {

    public void creerFacture(double montantHT, String clientName) {
        double tva = montantHT * 0.2;
        double total = montantHT + tva;

        // Affichage
        DisplayHandler.clientInfo(clientName, montantHT, tva, total);

        // Sauvegarde fichier
        SavingHandler.savingBill(clientName, montantHT, tva, total);
    }


    public void creerDevis(double montantHT) {
        double tva = montantHT * 0.2;
        double total = montantHT + tva;

        // Affichage
        DisplayHandler.quotationInfo(montantHT, tva, total);

        // Sauvegarde fichier
        SavingHandler.savingQuotation(montantHT, tva, total);
    }
}
