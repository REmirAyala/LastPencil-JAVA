import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] arrayInput = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arrayInput[i] = scanner.nextInt();
        }

        System.out.println(Arrays.stream(arrayInput).sum());
    }
}