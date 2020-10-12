public class Square extends Shape2D{
    private String name;
    private double length;

    public Square(double length){
        this.name = "square";
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
       return length * length;
    }

}
