import java.util.*;

public class Multi_Array {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of row : ");
        int m = sc.nextInt();
        System.out.println("Enter the no.of columns : ");
        int n = sc.nextInt();

        int num[][] = new int [m][n];

        // Generate random numbers and store to the Array
        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                 num[i][j] = (int) (Math.random() * 100);
            }
        }

        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                 System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

    }
}
