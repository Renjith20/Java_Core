package OOPs;

class Person{
    private String name;
    private int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}

public class Main {
    public static void main(String args[]){

        Person p1 = new Person("Renjith", 30);
        Person p2 = new Person("Ram",78);

        System.out.println(p1.getName() + " : " + p1.getAge());
        System.out.println(p2.getName() + " : " + p2.getAge());
    }
    
}
