public class Sum{
    public static int sum(int a, int b)
    {
        return a+b;
    }

    public static int sum(int a, int b, int c)
    {
        return a+b+c;
    }

    public static double sum(double a, double b)
    {
        return a+b;
    }

    public static float sum(float a, float b)
    {
        return a+b;
    }

    public static String sum(String a, int b)
    {
        return a + " " + b;
    }

    public static short sum(short a, short b)
    {
        return (short) (a+b);
    }
    public static void main(String[] args)
    {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20,30));
        System.out.println(sum(10.5, 20.1));
        System.out.println(sum(10.5f, 20.1f));
        System.out.println(sum("hello", 10));
        System.out.println(sum((short)10,(short)20));
    }
}