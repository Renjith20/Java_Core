import java.util.*;
public class Fibanocci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = sc.nextInt();
        int firstTerm = 0 , secondTerm = 1;
        for(int i = 0 ; i < n ; i++){
            System.out.print(firstTerm + "  ");

            int nextTerm = firstTerm + secondTerm ;
            firstTerm = secondTerm ;
            secondTerm = nextTerm; 

        }
    }
}
