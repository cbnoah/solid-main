import java.util.Scanner;

public class InputHandler {

    public static boolean menuChoice(Scanner scanner, FacturationService service, boolean quitter) {
        DisplayHandler displayHandler = new DisplayHandler(scanner);
        int choix = displayHandler.lireEntier("Choix : ");

        switch (choix) {
            case 1:
                displayHandler.traiterDocument(service, true);
                break;
            case 2:
                displayHandler.traiterDocument(service, false);
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
