import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Given an array of non-negative integers, A, of length N, you are initially positioned at the first index of the array.
//
//        Each element in the array represents your maximum jump length at that position.
//
//        Return the minimum number of jumps required to reach the last index.
//
//        If it is not possible to reach the last index, return -1.
//
//        Input Format:
//
//        The first and the only argument contains an integer array, A.
//        Output Format:
//
//        Return an integer, representing the answer as described in the problem statement.
//        Constraints:
//
//        1 <= N <= 1e6
//        0 <= A[i] <= 50000
//        Examples:
//
//        Input 1:
//        A = [2, 1, 1]
//
//        Output 1:
//        1
//
//        Explanation 1:
//        The shortest way to reach index 2 is
//        Index 0 -> Index 2
//        that requires only 1 jump.
//
//        Input 2:
//        A = [2,3,1,1,4]
//
//        Output 2:
//        2
//
//        Explanation 2:
//        The shortest way to reach index 4 is
//        Index 0 -> Index 1 -> Index 4
//        that requires 2 jumps.

public class MinJumps {

        public static int jump(ArrayList<Integer> A) {
            int[] jumpsArray = new int[A.size()];
            jumpsArray[A.size()-1] = 0;

            for(int i =A.size()-2;i>=0;i--)
            {
                int maxJumpLength = A.get(i);
                if(maxJumpLength == 0)
                {
                    jumpsArray[i] = -1;
                    continue;
                }
                int min = Integer.MAX_VALUE;
                for(int j=1;j<=maxJumpLength;j++)
                {
                    if(i+j==A.size())
                        break;
                    if(i+j < A.size() && jumpsArray[i+j] != -1 && jumpsArray[i+j]<min)
                    {
                        min = jumpsArray[i+j];
                    }
                }

                jumpsArray[i] = min==Integer.MAX_VALUE ? -1 : min+1;

            }
//             for(int i =0;i<A.size();i++)
//             {
//                 System.out.print(jumpsArray[i]+" ");
//             }
            return jumpsArray[0];
        }



    public static void main(String args[])
    {
        //A : [ 33, 21, 50, 0, 0, 46, 34, 3, 0, 12, 33, 0, 31, 37, 15, 17, 34, 18, 0, 4, 12, 41, 18, 35, 37, 34, 0, 47, 0, 39, 32, 49, 5, 41, 46, 26, 0, 2, 49, 35, 4, 19, 2, 27, 23, 49, 19, 38, 0, 33, 47, 1, 21, 36, 18, 33, 0, 1, 0, 39, 0, 22, 0, 9, 36, 45, 31, 4, 14, 48, 2, 33, 0, 39, 0, 37, 48, 44, 0, 11, 24, 16, 10, 23, 22, 41, 32, 14, 22, 16, 23, 38, 42, 16, 15, 0, 39, 23, 0, 42, 15, 25, 0, 41, 2, 48, 28 ]
        Integer[] arr = { 33, 21, 50, 0, 0, 46, 34, 3, 0, 12, 33, 0, 31, 37, 15, 17, 34, 18, 0, 4, 12, 41, 18, 35, 37, 34, 0, 47, 0, 39, 32, 49, 5, 41, 46, 26, 0, 2, 49, 35, 4, 19, 2, 27, 23, 49, 19, 38, 0, 33, 47, 1, 21, 36, 18, 33, 0, 1, 0, 39, 0, 22, 0, 9, 36, 45, 31, 4, 14, 48, 2, 33, 0, 39, 0, 37, 48, 44, 0, 11, 24, 16, 10, 23, 22, 41, 32, 14, 22, 16, 23, 38, 42, 16, 15, 0, 39, 23, 0, 42, 15, 25, 0, 41, 2, 48, 28 };
        List a = Arrays.asList(arr);
        int ans = jump(new ArrayList<>(a));
        System.out.println(ans);
    }
}
