import java.util.Scanner;

public class ArrayStore
{
    private int[] arr = new int[10];

    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integers: ");

        for(int i=0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    public void DisplayFor()
    {
        System.out.println("\nArray Display Using For Loop: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public void DisplayWhile()
    {
        System.out.println("\nArray Display Using While Loop: ");
        int i = 0;
        while(i<arr.length)
        {
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    public void sortArray()
    {
        System.out.println("\nSorted Array");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public void CountOccurrences(int num)
    {
        int count = 0;

        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] == num) {
                count++;
            }
        }
        System.out.println("No. of Occurrences of Element " + num + " = " + count);
    }

    public void InsertAtPosition(int num, int pos)
    {
        if(pos<0 || pos >= arr.length)
        {
            System.out.println("Invalid Position");
        }

        for(int i = arr.length-1; i>pos;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[pos] = num;
        System.out.print("The number " + num + " is inserted at position at " + pos);
    }

    public int[] RemoveDuplicateElements()
    {
        int[] temp = new int[arr.length];
        int size = 0;
        for (int i=0; i< arr.length; i++)
        {
            boolean found = false;

            for(int j=0; j<size; j++)
            {
                if(arr[i] == temp[j])
                {
                    found = true;
                    break;
                }
            }

            if(!found) {
                temp[size] = arr[i];

                size++;
            }
        }

        int[] result =  new int[size];

        for(int i=0; i<size; i++)
        {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayStore obj = new ArrayStore();

        obj.Input();
        obj.DisplayFor();
        obj.DisplayWhile();
        obj.sortArray();

        System.out.println("\nEnter the element for count: ");
        int n;
        n = sc.nextInt();
        obj.CountOccurrences(n);

        System.out.println("Enter the Element to Insert");

        int num, pos;
        num = sc.nextInt();
        System.out.println("Enter the position");
        pos = sc.nextInt();

        obj.InsertAtPosition(num, pos);
        obj.DisplayFor();

        int[] narr = obj.RemoveDuplicateElements();

        System.out.println("\nArray Without Duplicates: ");

        for(int val: narr)
        {
            System.out.print(val + " ");
        }
        sc.close();
    }
}