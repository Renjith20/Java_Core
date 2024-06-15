
class Mobile{

    static String name ;
    int price;
    String brand;

    public void show(){
        System.out.println(brand + " : " + name + " : " + price);
    }
// Ststic method : parameter is class name (Mobile) , and object name
    public static void show1(Mobile obj){
        // calling the non static variables using object name (obj)
        System.out.println(obj.brand + " : " + name + " : "+ obj.price);
    }

}

public class StaticMethod {
    public static void main(String args[]){

        Mobile obj1 = new Mobile();
        Mobile.name = "Smartphone";
        obj1.brand = "Apple";
        obj1.price = 13000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 90888;
        Mobile.name = "Smartphone";

        obj1.show();
        obj2.show();

        // Calling static method
        Mobile.show1(obj2);
    }    
}
