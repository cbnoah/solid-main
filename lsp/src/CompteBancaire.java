public class CompteBancaire {

    protected double solde = 100;

    public void retirer(double montant) {
        solde -= montant;
        System.out.println("Retrait effectué. Nouveau solde : " + solde);
    }
}
