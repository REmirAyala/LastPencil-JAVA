import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayNumber = new int[4];

        for (int i = 0; i < 4; i++) {
            arrayNumber[i] = scanner.nextInt() - 1;
            System.out.print(arrayNumber[i] + " ");
        }
    }
}