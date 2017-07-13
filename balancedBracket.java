/*using stack*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            boolean check = toCheck(s.toCharArray());
            if(check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
    public static boolean toCheck(char[] a)
    {
        int len=a.length;
        Stack<Character> bracket = new Stack<Character>();
        for(int i=0;i<len;i++)
        {
            switch(a[i])
            {
                case '[':
                case '{':
                case '(': bracket.push((Character)a[i]);break;
                    
            }
            
            if(bracket.isEmpty())
                return false;
            if(a[i]==']')
            {
                char b = (char)bracket.peek();
                if(b=='[')
                    bracket.pop();
                else 
                    return false;
            }
            if(a[i]=='}')
            {
                char b = (char)bracket.peek();
                if(b=='{')
                    bracket.pop();
                else 
                    return false;
            }
            if(a[i]==')')
            {
                char b = (char)bracket.peek();
                if(b=='(')
                    bracket.pop();
                else 
                    return false;
            }
        }
        if(!bracket.isEmpty())
            return false;
        return true;
    }
}
