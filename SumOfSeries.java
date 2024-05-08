import java.util.Scanner;

public class SumOfSeries {
    /**
     * Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms) 
     * @param args
     * Input:
       N = 5
Output: 15
Explanation: For n = 5, sum will be 15.
1 + 2 + 3 + 4 + 5 = 15.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;

        System.out.println("enter the number:");
        int num=input.nextInt();

        if(num==0){
            System.out.println("the sum is 0");
        }
        else if(num==1){
            System.out.println("the sum is 1");
        }
        else if(num<0){
            System.out.println("check the number entered");
        }
        else{
            for(int i=0;i<=num;i++){
                sum=sum+i;
            }
            System.out.println("sum of series is"+sum);
        }
    }
    
}
