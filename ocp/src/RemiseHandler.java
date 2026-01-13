abstract public class RemiseHandler {
    private final double remise;
    public RemiseHandler(double remise) {
        this.remise = remise;
    }

    protected double calcul(double montant) {
        return montant * remise;
    }
}
