public class Pattern5 {
    public static void main(String args[]){
        int row = 5;

        for(int i = row; i>=1 ; --i){
            for(int j = 1;j <= i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
