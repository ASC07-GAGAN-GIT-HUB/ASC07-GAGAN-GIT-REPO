import java.util.Scanner;

public class WelcomeMessage {

    public static String welcomeMethod(String name)
    {
        return "Welcome " + name;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String Name = sc.nextLine();

        System.out.println(welcomeMethod(Name));

        sc.close();


    }
}
