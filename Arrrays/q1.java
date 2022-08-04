/*
 * Reverse an Array
 * Given an array A of size N, print the reverse of it.

Example:

Input:
1
4
1 2 3 4
Output:
4 3 2 1
 */

import java.util.*;


class q1 {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int N=sc.nextInt();
		    int a[]=new int[N];
		    for(int i=0;i<N;i++)
		    {
		       a[i]=sc.nextInt();
		       
		    }
		    int start=0,end=N-1;
		    while(start<end)
		    {
		        int t=a[start];
		        a[start]=a[end];
		        a[end]=t;
		        start++;
		        end--;
		    }
		   for (int i = 0; i < N; i++)
             System.out.print(a[i] + " ");
          
         System.out.println();
		}
		
		sc.close();
	}
}