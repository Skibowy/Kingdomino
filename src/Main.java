import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DominoView dominoView = new DominoView();
        boolean shouldContinue = true;

        do {
            dominoView.fillDominos();

            do {
                for (Domino d : dominoView.listaDomin) {
                    System.out.println(d.toString());
                }
                System.out.println("Podaj cztery wylosowane domina:");
                for (int i = 1; i < 5; i++) {
                    int a = scanner.nextInt();
                    scanner.skip("\\R?");
                    dominoView.listaDomin.remove(dominoView.getDomino(a));
                }
            } while (dominoView.listaDomin.size() != 4);
            System.out.println("Wpisz '1' aby zakończyć lub '2' aby kontynuować");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                shouldContinue = false;
            }
        }while(shouldContinue);
    }
}