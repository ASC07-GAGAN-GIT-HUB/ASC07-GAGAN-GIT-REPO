import java.util.Scanner;

public class DigitToWords {

    public static void printDigitInWords(int num){
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        String numStr = String.valueOf(num);

        for(char digit: numStr.toCharArray())
        {
            System.out.print(words[digit - '0'] + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to convert into words:");
        int n = sc.nextInt();

        printDigitInWords(n);

    }
}
