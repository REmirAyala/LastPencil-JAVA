import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        int temp = 0;

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = n - 1; i > 0; i--) {
            int temp2 = array[i] * array[i - 1];
            if (temp2 > temp) {
                temp = temp2;
            }
        }

        System.out.println(temp);


    }
}
