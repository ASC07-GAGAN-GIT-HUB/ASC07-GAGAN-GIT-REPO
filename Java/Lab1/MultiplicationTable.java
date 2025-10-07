import java.util.Scanner;

public class MultiplicationTable
{
    public static void UsingForLoop(int num)
    {
        System.out.println("\nUsing For Loop\n");
        for(int i=1; i<=10; i++)
        {
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }

    public static void UsingWhileLoop(int num)
    {
        System.out.println("\nUsing While Loop\n");
        int i = 1;

        while (i<=10)
        {
            System.out.println(num + " X " + i + " = " + (num*i));
            i++;
        }
    }

    public static void UsingDoWhileLoop(int num)
    {
        System.out.println("\nUsing Do While Loop\n");
        int i = 1;

        do {
            System.out.println(num + " X " + i + " = " + (num*i));
            i++;
        }while (i<=10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int num;
        num = sc.nextInt();

        UsingForLoop(num);
        UsingWhileLoop(num);
        UsingDoWhileLoop(num);

        sc.close();
    }
}