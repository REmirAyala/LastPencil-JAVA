import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] box = new int[3];
        int[] box2 = new int[3];

        for (int i = 0; i < box.length; i++) {
            box[i] = scanner.nextInt();
        }

        Arrays.sort(box);

        for (int i = 0; i < box.length; i++) {
            box2[i] = scanner.nextInt();
        }

        Arrays.sort(box2);
        int compatible = 0;

        for (int i = 0; i < 3; i++) {
            if (box[i] > box2[i]) {
                if (compatible == 2) {
                    compatible = 0;
                    break;
                }
                compatible = 1;
            } else if ((box[i] < box2[i])) {
                if (compatible == 1) {
                    compatible = 0;
                    break;
                }
                compatible = 2;
            } else if ((box[i] == box2[i])) {
                compatible = 0;
                break;
            }
        }

        if (compatible == 2){
            System.out.println("Box 1 < Box 2");
        } else if (compatible == 1) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}