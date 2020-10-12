public class Sphere extends Shape3D {
    private String name;
    private double radius;

    public Sphere(double radius){
        this.name = "sphere";
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return 4 * 3.14159 * (radius * radius);
    }

    public double getVolume(){
        return (4 * 3.14159 * (radius * radius * radius))/3;
    }
}
