import java.util.Scanner;
//Find the factorial of a large number. 
public class Factorial{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long fact=1;
        System.out.println("enter the value of n");
        long n=input.nextInt();

        if(n==0){
            System.out.println("fact=0");
        }
        else{
           for(int i=1;i<=n;i++){
            fact=fact*i;
           }
           System.out.println("fact="+fact);
        }
    }
}
