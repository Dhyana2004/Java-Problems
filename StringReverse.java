import java.util.Scanner;
import java.util.Stack;

public class StringReverse {
    /**
     * You are given a string s. You need to reverse the string.
     * Input:
s = for
Output: rof
     */
    public static void main(String[] args) {
        Stack <Character> stack=new Stack<>();
        Scanner input=new Scanner(System.in);
        char element;
        System.out.println("enter the string to reverse:");
        String data=input.nextLine();
        for(int i=0;i<data.length();i++){
            stack.push(data.charAt(i));
        }
        for(int i=0;i<data.length();i++){
            if(stack.isEmpty()){
                System.out.println("no element");
            }else{
            element=stack.pop();
            System.out.print(element);
            }
        }   
        
    }
}
