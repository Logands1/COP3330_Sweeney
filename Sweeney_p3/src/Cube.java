public class Cube extends Shape3D {
    private String name;
    private double length;

    public Cube(double length){
        this.name = "cube";
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return (length * length) * 6;
    }

    public double getVolume(){
        return length * length * length;
    }
}
