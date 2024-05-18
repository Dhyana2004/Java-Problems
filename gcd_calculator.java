import java.util.Scanner;

public class gcd_calculator {
    static int gcd_slove(int a,int b){
        if(a==b){
            return a;
        }
        if(a==0){
            return a;
        }
        if(b==0){
            return b;
        }
        if(a>b){
            return gcd_slove(a-b,b);
        }
        return gcd_slove(a,b-a);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first element:");
        int element1=input.nextInt();
        System.out.println("enter the next element");
        int element2=input.nextInt();
      System.out.println( gcd_slove(element1, element2));
    }
    
}
