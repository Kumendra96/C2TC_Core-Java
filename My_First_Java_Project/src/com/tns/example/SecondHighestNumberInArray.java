package com.tns.example;
public class SecondHighestNumberInArray 
{
	public static void main(String[] args)
    {
        int arr[] = { 100,14, 46, 47, 94, 93, 52, 86, 36, 97, 89 };
        int largest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;    
        System.out.println("The given array is:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
            else if(arr[i] > thirdLargest)
            {
            	thirdLargest = arr[i];
            }
        }
        System.out.println("\nLargest Number is: "  + largest);
        System.out.println("Second largest number is: " + secondLargest);
        System.out.println("Third largest number is: " + thirdLargest);
    }
}