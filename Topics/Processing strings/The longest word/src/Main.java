import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phrase = scanner.nextLine();

        String largestWord = "";

        String[] eachWord = phrase.split(" ");

        for (String word : eachWord) {
            if(word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        System.out.println(largestWord);


    }
}