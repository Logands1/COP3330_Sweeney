public class Triangle extends Shape2D{
    private String name;
    private double length;
    private double height;

    public Triangle(double length, double height){
        this.name = "triangle";
        this.length = length;
        this.height = height;
    }

    public String getName() {
        return name;
    }


    public double getArea() {
        return (length * height)/2;
    }
}
