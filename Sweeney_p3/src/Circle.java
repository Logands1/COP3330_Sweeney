public class Circle extends Shape2D {
    private String name;
    private double radius;

    public Circle(double radius){
        this.name = "circle";
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return 3.14159 * (radius * radius);
    }
}
