import java.util.Scanner;

public class MainSRP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FacturationService service = new FacturationService();


        boolean quitter = false;

        while (!quitter) {
            DisplayHandler.afficherMenu();
            quitter = InputHandler.menuChoice(scanner, service, quitter);

        }
        scanner.close();
    }

}
