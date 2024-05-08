import java.util.Scanner;
import java.util.Arrays;
public class SortArray {
   /** 
    Given an array of size N containing only 
    0s, 1s, and 2s sort the array in ascending 
    order.
 Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
 */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int temp;
        int []Array=new int[5];
        System.out.println("enter the array element");
        for(int i=0;i<Array.length;i++){
            Array[i]=input.nextInt();
        }
        Arrays.sort(Array);
      System.out.println("sorted array are");
      for(int element:Array){
        System.out.print("\t"+element);
      } 
    }
}
