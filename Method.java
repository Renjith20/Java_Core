

class Computer{
    public void PlayMusic(){
        System.out.println("Playing Music ..... ");
    }

    public String GetAPen(int cost){
        if(cost >= 10)
         return "Pen";
        return "No pen";
    }
}
public class Method {

    public static void main(String args[])
    {
        Computer cmp = new Computer();
        cmp.PlayMusic();
        //  GetAPen method is a String method
        String str = cmp.GetAPen(3);
        System.out.println(str);
    }
}