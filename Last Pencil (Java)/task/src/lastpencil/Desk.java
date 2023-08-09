package lastpencil;

import java.util.*;

import static lastpencil.Main.player1;
import static lastpencil.Main.player2;

public class Desk {
    ArrayList<Character> pencils;

    public Desk(int pencilCount) {
        pencils = new ArrayList<>();
        for (int i = 0; i < pencilCount; i++) {
            pencils.add('|');
        }
    }

    public void removePencil(int pencilCountRemove) {
        for (int i = 0; i < pencilCountRemove; i++) {
            if (!pencils.isEmpty()) { // prevent IndexOutOfBoundsException
                pencils.remove(pencils.size() - 1);
            }
        }
    }

    public void printDesk() {
        for (char pencil : pencils) {
            System.out.print(pencil);
        }
        System.out.println();
    }

    public void startGame(String nameInput) {
        boolean winner = false;

        while (!winner) {
            if (Objects.equals(nameInput, player1)) {
                System.out.printf("%s's turn!%n", player1);
                int inputRemove = numberComprobation();
                this.removePencil(inputRemove);
                this.printDesk();
                if (this.pencils.size() == 0) {
                    System.out.printf("%s won!", player2);
                    winner = true;
                }
                nameInput = player2;
            } else if (Objects.equals(nameInput, player2)) {
                System.out.printf("%s's turn!%n", player2);
                int inputRemove = AImoving();
                System.out.println(inputRemove);
                this.removePencil(inputRemove);
                this.printDesk();
                if (this.pencils.size() == 0) {
                    System.out.printf("%s won!", player1);
                    winner = true;
                }
                nameInput = player1;
            }
        }
    }

    private int AImoving() {
        Random random = new Random(1);
        if (this.pencils.size() % 4 == 0) {
            return 3;
        } else if ((this.pencils.size() - 3) % 4 == 0) {
            return 2;
        } else if (this.pencils.size() == 2 || (this.pencils.size() - 2) % 4 == 0) {
            return 1;
        } else {
            return random.nextInt(3) + 1;
        }

    }

    private int numberComprobation() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect = false;
        int inputN = 0;
        while (!isCorrect) {

            try {
                inputN = scanner.nextInt();
                if (inputN <= 0 || inputN >= 4) {
                    System.out.println("Possible values: '1', '2' or '3'");
                } else if (inputN > this.pencils.size()) {
                    System.out.println("Too many pencils were taken");
                } else {
                    isCorrect = true;
                }
            } catch (InputMismatchException ignored) {
                scanner.next();
                System.out.println("Possible values: '1', '2' or '3'");
            }
        }
        return inputN;
    }
}

