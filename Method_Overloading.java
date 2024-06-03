
class Calculator {

    public int add(int n1 , int n2){
        int result = n1 + n2 ;
        return result;
    }
    // Same Method name but different parameters
    public int add(int n1, int n2, int n3){
        int result = n1 + n2 + n3;
        return result;
    }
// same method name same no.of parameters but type is different(double)
    public double add(double n1 , int n2){
        double res = n1 + n2;
        return res;
    }
    
}

public class Method_Overloading {
    public static void main(String args[]){


        Calculator calc = new Calculator();
        int r1 = calc.add(3, 8);
        System.out.println("Result 1 : " + r1);
        double r2 = calc.add(56.8, 50);
        System.out.println("Result 2 : " + r2);
        int r3 = calc.add(45, 5, 65);
        System.out.println("Result 3 : "+r3);
    }   
}
