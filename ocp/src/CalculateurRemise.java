public class CalculateurRemise {

    public double calculerTotal(int typeClient, double montant) {

        if (typeClient == 1) {               // Standard
            return montant;
        } else if (typeClient == 2) {        // Étudiant
            return montant * 0.9;
        } else if (typeClient == 3) {        // VIP
            return montant * 0.8;
        } else {
            System.out.println("Type client inconnu");
            return montant;
        }
    }
}
