import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder pass = new StringBuilder();
        int counter = 0;



        int upperCase = scanner.nextInt();
        int lowerCase = scanner.nextInt();
        int digit = scanner.nextInt();
        int length = scanner.nextInt();

        for (int i = 0; i < upperCase; i++) {

            char ch = (char) (65);
            counter++;
            ch = (char) (ch + counter);
            if (ch > 85) {
                counter = 0;
                pass.append(ch);
            } else {
                pass.append(ch);
            }


        }

        for (int i = 0; i < lowerCase; i++) {
            char ch = (char) (97);
            counter++;
            ch = (char) (ch + counter);
            if (ch > 120) {
                counter = 0;
                pass.append(ch);
            } else {
                pass.append(ch);
            }

        }

        for (int i = 0; i < digit; i++) {
            char ch = (char) (48);
            counter++;
            ch = (char) (ch + counter);
            if (ch > 54) {
                counter = 0;
                pass.append(ch);
            } else {
                pass.append(ch);
            }

        }

        for (int i = 0; i < (length - upperCase - lowerCase - digit); i++) {
            char ch = (char) (48);
            counter++;
            ch = (char) (ch + counter);
            if (ch > 54) {
                counter = 0;
                pass.append(ch);
            } else {
                pass.append(ch);
            }

        }

        System.out.println(pass);
    }
}