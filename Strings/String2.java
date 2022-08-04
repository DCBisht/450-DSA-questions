/*
 * Palindrome String
 * Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
 */

package Strings;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;


class String2 {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        String NS="";
        int l=S.length();
        int start,end;
        if(l%2==0)
        {
            start=l/2-1;
            end=l/2;
        }
        else
        {
            NS=NS+S.charAt(l/2);
            start=l/2-1;
            end=l/2+1;
        }
        for(;end<l;end++)
        {
            NS=S.charAt(end)+NS+S.charAt(start);
            start--;
            
        }
        
    if(NS.equals(S))
    return 1;
    else
    return 0;
    }
};