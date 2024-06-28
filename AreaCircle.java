class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double Area(){
        return Math.PI * radius * radius;
    }
    public double Circum(){
        return 2 * Math.PI * radius ;
    }
}

public class AreaCircle {
    public static void main(String [] args){

        double r = 4;

        Circle c1 = new Circle(r);

        System.out.println("Radius : " + r);
        System.out.println("Area : " + c1.Area());
        System.out.println("Circumferences : " + c1.Circum());

        double r1 = 5;
        c1.setRadius(r1);
        System.out.println("Radius : " + r1);
        System.out.println("Area : " + c1.Area());
        System.out.println("Circumferences : " + c1.Circum());


    }   
}
