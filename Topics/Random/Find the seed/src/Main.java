import java.util.*;
import java.util.Random;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int A = scanner.nextInt(); // Maximo de la semilla
            int B = scanner.nextInt(); // Minimo de la semilla
            int N = scanner.nextInt(); // Cantidad de veces
            int K = scanner.nextInt(); // random.nextInt(k) maximo del rango 0 a K

            int minSeed = A;
            int minMax = Integer.MAX_VALUE;

            for (int seed = A; seed <= B; seed++) {
                Random random = new Random(seed);
                int currentMax = 0;
                for (int j = 0; j < N; j++) {
                    int num = random.nextInt(K);
                    currentMax = Math.max(currentMax, num);
                }

                if (currentMax < minMax) {
                    minMax = currentMax;
                    minSeed = seed;
                }
            }

            System.out.println(minSeed);
            System.out.println(minMax);
        }
}