package OOPs;


class Rectangle{
    private double width;
    private double height;

    public Rectangle(double width , double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double Area(){
        return width * height;
    }

    public double Perimeter(){
        return 2 * (width + height);
    }
}

public class AreaPeri {
    public static void main(String[] args){

        Rectangle rectangle = new Rectangle(8.9, 9.76);

        System.out.println("Area : " + rectangle.Area());
        System.out.println("Perimeter : " + rectangle.Perimeter());


        rectangle.setWidth(5);
        rectangle.setHeight(6);

        System.out.println("Area : " + rectangle.Area());
        System.out.println("Perimeter : " + rectangle.Perimeter());
    }
    
}
