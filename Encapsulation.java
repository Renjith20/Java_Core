class Human{

    private int age = 30;
    private String name = "Renjith";

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

}

public class Encapsulation {
    public static void main(String args[]){
        Human obj = new Human();
        obj.setName("Renjith");
        obj.setAge(22);
        System.out.println(obj.getName() + "  :  " + obj.getAge());
    }
}
