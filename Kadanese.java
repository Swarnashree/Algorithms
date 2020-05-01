/* program to find subarray with maximum sum */
import java.util.*;

class Main {
    static public void main( String args[] ) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = findSum(arr);
        System.out.println(sum);
    }

//    private static int findSum(int[] arr)
//    {
//        int index = 0;
//        int currentMax =0;
//        int previousMax=0;
//        boolean negative = false;
//        int negMin = 0;
//        for(int i =0;i<arr.length;i++)
//        {
//            if(arr[i]>=0)
//            {
//                currentMax += arr[i];
//            }
//            else
//            {
//                previousMax = previousMax > currentMax ? previousMax : currentMax;
//                currentMax = 0;
//            }
//
//        }
//
//        if(currentMax>=previousMax)
//            return currentMax;
//        return previousMax;
//    }

    private static int findSum(int[] arr)
    {
        int local_max = 0;
        int total_max = Integer.MIN_VALUE;
        int startIndex = -1;
        int endIndex = -1;
        for(int i=0;i<arr.length;i++)
        {
            local_max = Math.max(local_max+arr[i],arr[i]);

            if(local_max>total_max)
            {
                total_max = local_max;
                if(local_max==arr[i])
                {
                    startIndex = i;
                    endIndex = i;
                }
                else
                    endIndex = i;
            }
        }
        System.out.println("start "+startIndex);
        System.out.println("end "+endIndex);
        return total_max;
    }
}
