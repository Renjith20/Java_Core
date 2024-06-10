class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name );
    }
}


public class StaticKeyword {
    public static void main(String args[]){

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 78000;
        // class_name.property  - Because of using static keyword.
        Mobile.name = "Smart Phone"; 

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 67000;
        Mobile.name = "Smart Phone";

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
}
