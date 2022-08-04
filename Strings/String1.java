/**reverseString
 * 
 * Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * 
 */
package Strings;

class String1 {
    public void reverseString(char[] s) {
        int l=s.length;
        char ns[]=new char[l+1];
        int k=0,i;
        for(i=l-1;i>=0;i--)
        {
            ns[k]=s[i];
            k++;
        }
        for(i=0;i<l;i++)
            
        {
            s[i]=ns[i];
        }
        
    }
}