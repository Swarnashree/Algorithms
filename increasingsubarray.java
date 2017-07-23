//find the number of strictly increasing subarrays
/* 2
6
1 3 3 2 3 5
2
1 5
*/

import java.util.*;
import java.io.*;

public class increasingsubarray{

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i = 0;i<t; i++)
        {
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j] = s.nextInt();
                
            }

            int len = arr.length;
           
            int sum=0;
            int start = 0;
            
            for(int k=1;k<len;k++)
            {
                if(arr[k]>arr[k-1])
                {
                    sum+= k-start;
                }
            else
                start=k;
            }
            System.out.println(sum);
        }
    }






}