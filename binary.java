import java.util.*;
public class MyBinarySearch
{
    public static void main(String[] args)
    {
        // this is an integer array with size 10
        int[] a = new int[15];
        int searchV = 0, index;
        System.out.println("Enter 15 numbers");
        //now we put all the value in a previous define array with
help of scanner class
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++)
        {
            a[i] = input.nextInt();
        }
        System.out.print("Enter a number to search for: ");
        // take the user input which he wants to search
        searchV = input.nextInt();
        index = binarySearch(a, searchV);
        if (index != -1)
        {
            System.out.println("Found at index: " + index);
        } else
        {
            System.out.println("Not Found");
        }
    }
    // here we define binary search method
    static int binarySearch(int[] search, int find)
    {
        int start, end, midPt;
        start = 0;
        end = search.length - 1;
        while (start <= end)
        {
            midPt = (start + end) / 2;
            if (search[midPt] == find)
            {
                return midPt;
            } else if (search[midPt] < find)
            {
                start = midPt + 1;
            } else
            {
                end = midPt - 1;
            }
        }
        return -1;
    }
