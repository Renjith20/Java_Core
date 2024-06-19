import java.util.*;
public class PalindromeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int originalnum = num;
        int reverse = 0 , remainder;
        while(num!=0){
            remainder = num % 10 ;
            reverse = reverse * 10 + remainder;
            num/=10;
        }
        if(originalnum == reverse){
            System.out.println(originalnum + " is a Palindrome");
        }else{
            System.out.println(originalnum + " is not a palindrome");
        }
    }
}