/*
Given a string, find the length of the longest substring without repeating characters.
Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3.
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

public class Solution {

    public static void main()
    {
      /*enter code for test cases and create Solution class object to use the method*/
    
    
    }
    public int lengthOfLongestSubstring(String s) {
    
    
    Map<Character,Integer> index=new HashMap<Character,Integer>();
    int start=0;
    int end=0;
    int max=0,length=0;
    for(int i=0;i<s.length();i++)
    {
        if(index.containsKey(s.charAt(i)))
        {
            int temp=(int)index.get(s.charAt(i));
            if((temp+1)>start)
                start=temp+1; /*important */
           
            index.put(s.charAt(i),i);
            end=i+1;
        }
        
        else
        {
            index.put(s.charAt(i),i);
            end=i+1;
        }
        
        length=end-start;
        if(length>max) max=length;
    
        
    }
    
    return max;
        
    }
}
