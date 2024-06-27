package OOPs;
class Dog{
    private String name;
    private String breed;

    public Dog(String name , String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBreed(){
        return breed;        
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
}
public class DogBreed {
    public static void main(String args[]){
        
        Dog d1 = new Dog("jim" , "Bulldog");
        Dog d2 = new Dog("tim" , "Golden Retriever");

        System.out.println(d1.getName() + " : " + d1.getBreed());
        System.out.println(d2.getName() + " : " + d2.getBreed());

        System.out.println("Set the new Breed of dog1 and new name of dog2:");

        d1.setBreed("Labradour");
        d2.setName("Anandhi");

        System.out.println(d1.getName() + " : " + d1.getBreed());
        System.out.println(d2.getName() + " : " + d2.getBreed());
    }
}
