public class ImprimanteSimple implements Machine {

    public void print() {
        System.out.println("Impression en cours...");
    }

    public void scan() {
        throw new UnsupportedOperationException();
    }

    public void fax() {
        throw new UnsupportedOperationException();
    }
}
