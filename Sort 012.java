import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int lo = 0; 
        int hi = arr.length - 1; 
        int mid = 0; 
        int temp; 
        while (mid <= hi) { 
            switch (arr[mid]) { 
                case 0: { 
                    temp = arr[lo]; 
                    arr[lo] = arr[mid]; 
                    arr[mid] = temp; 
                    lo++; 
                    mid++; 
                    break; 
                } 
                case 1: 
                    mid++; 
                    break; 
                case 2: { 
                    temp = arr[mid]; 
                    arr[mid] = arr[hi]; 
                    arr[hi] = temp; 
                    hi--; 
                    break; 
                } 
            } 
        }
    }
}
