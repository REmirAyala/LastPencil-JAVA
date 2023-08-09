package lastpencil;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    static String player1 = "John";
    static String player2 = "Jack";

    public static void main(String[] args) {

        System.out.println("How many pencils would you like to use:");
        int inputNumber = readNumber();

        // NEW OBJECT
        Desk desk = new Desk(inputNumber);

        System.out.printf("Who will be the first (%s, %s):%n", player1, player2);
        String nameInput = readName();

        //print OBJET
        desk.printDesk();

        //Start game
        desk.startGame(nameInput);
}

    private static String readName() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect = false;
        String inputName = null;

        while (!isCorrect) {
            inputName = scanner.nextLine();
            if (Objects.equals(inputName, player1) || Objects.equals(inputName, player2)) {
                isCorrect = true;
            } else {
                System.out.println("Choose between 'John' and 'Jack'");
            }
        }
        return inputName;
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect = false;
        int inputN = 0;
        while (!isCorrect) {
            String line = scanner.nextLine().trim();
            try {
                if (line.isEmpty()) {
                    System.out.println("The number of pencils should be numeric");
                } else {
                    inputN = Integer.parseInt(line);
                    if (inputN <= 0) {
                        System.out.println("The number of pencils should be positive");
                    } else {
                        isCorrect = true;
                    }
                }
            } catch (NumberFormatException ignored) {
                System.out.println("The number of pencils should be numeric");
            }
        }
        return inputN;
    }
}
