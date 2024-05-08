import java.util.Scanner;
public class DuplicateElementsFinder {
    /**
     * Given an array a of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1].
     *
     * Note: The extra space is only for the array to be returned. Try and perform all operations within the provided array.
     * Input:
     * N = 5
     * a[] = {2,3,1,2,3}
     * Output:
     * 2 3
     * Explanation:
     * 2 and 3 occur more than once in the given array.
     * */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] Array = new int[5];
        int duplicate=0;
        System.out.println("enter the elements in the array");
        for(int i=0;i<Array.length;i++){
            Array[i]=input.nextInt();
        }
        System.out.println("the entered element in the array are");
        for(int element:Array){
            System.out.println(element);
        }
        System.out.println();
        for(int i=0;i<Array.length;i++){
            for(int j=i+1;j<Array.length;j++){
                if(Array[i]==Array[j]){
                    duplicate++;
                    System.out.println("duplicate element :"+Array[i]);
                    break;
                }
            }
        }
        if(duplicate==0){
            System.out.println("-1");
        }
    }
}

