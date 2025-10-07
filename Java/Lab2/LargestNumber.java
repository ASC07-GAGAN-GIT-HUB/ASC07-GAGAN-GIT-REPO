import java.util.Scanner;

public class LargestNumber {
    public static int Largest(int num1, int num2, int num3)
    {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b ,c;

        System.out.println("Enter the First Number: ");
        a = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        b = sc.nextInt();

        System.out.println("Enter the Third Number: ");
        c = sc.nextInt();

        System.out.println("The Largest among the three numbers is: " + Largest(a,b,c));

    }
}
