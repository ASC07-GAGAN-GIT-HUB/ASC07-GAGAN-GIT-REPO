import java.util.Scanner;

public class WordCount {
    public static int countWords(String str)
    {
        String[] words = str.split("\\s+");

        int count = 0;

        for(String word : words)
        {
            if (word.matches("[a-zA-Z]+"))
            {
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String input = sc.nextLine();

        System.out.println("Word Count: " + countWords(input));

        sc.close();
    }
}