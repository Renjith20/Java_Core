class A{
    public A(){
        super();
        System.out.println("in A");
    }

    public A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        // here passing a value the super() excutes the super class's parameterised constructor and print "in A int".
        // super(8);
        super();
        System.out.println("in B");
    }

    public B(int n){
        // super(n); // executes the constructor of super class (:here "class A") . passing the argument "n" which means excutes the parameterised constructor.
        // this() excutes the constructors of same class.
        this();
        System.out.println("in B int");
    }
}

public class thisAndsuper {
    public static void main(String args[])
    {
        B obj = new B(7);
    }
}
