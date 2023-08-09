import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long product = 1;
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i < b; i++) {

            product = product * i;
        }

        System.out.println(product);
        // start coding here
    }
}