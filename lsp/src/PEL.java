import java.util.Date;

public class PEL extends CompteBancaire {
    private final double tauxInteret = 0.03;

    @Override
    public void retirer(double montant) {
        throw new IllegalStateException("Impossible de retirer d'un PEL avant la date d'échéance.");
    }
}
