/**Iterative way :
 
1) Initialize start and end indexes as start = 0, end = n-1 
2) In a loop, swap arr[start] with arr[end] and change start and end as follows : 
start = start +1, end = end – 1 until start < end.
**/

import java.util.*;

public class Main{

  //NO RETURN as PASS BY REFERENCE AS PASSING ADDRESS OF ARRAY
  static void arrayReverse(int [] arr, int size)
  {
    for (int i = 0,j = size-1; i < j; i++,j--)//IMP
    {
      int temp=0;
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
          
  }

  static void printArray(int [] arr, int size) //IMP
  {
    for (int i = 0; i < size; i++)
    {
      System.out.print(arr[i] + " ");
    }
  }



  public static void main(String args[])
  {
    int [] arr = {2,4,1,6,7,3};
    int n = arr.length;
    printArray(arr,n); //N times
    arrayReverse(arr,n);// Less than N
    System.out.println("\nReverse Array is :");
    printArray(arr,n);//N times
    // Time Complexity = aN + b ...
    // = O(N)

  }
}
