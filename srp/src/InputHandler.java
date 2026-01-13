import java.util.Scanner;

public class InputHandler {

    public static boolean menuChoice(Scanner scanner, FacturationService service, boolean quitter) {

        int choix = DisplayHandler.lireEntier(scanner, "Choix : ");

        switch (choix) {
            case 1:
                DisplayHandler.traiterDocument(scanner, service, true);
                break;
            case 2:
                DisplayHandler.traiterDocument(scanner, service, false);
                break;
            case 0:
                quitter = true;
                System.out.println("Au revoir !");
                break;
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
        }
        return quitter;

    }
}
