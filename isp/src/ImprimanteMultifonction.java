public class ImprimanteMultifonction implements Machine {

    public void print() {
        System.out.println("Impression en cours...");
    }

    public void scan() {
        System.out.println("Scan en cours...");
    }

    public void fax() {
        System.out.println("Fax envoyé...");
    }
}
