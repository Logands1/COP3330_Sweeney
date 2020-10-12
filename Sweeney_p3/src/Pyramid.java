import java.awt.event.MouseAdapter;
import java.lang.Math;

public class Pyramid extends Shape3D  {
    private String name;
    private double length;
    private double width;
    private double height;

    public Pyramid(double length, double width, double height){
        this.name = "pyramid";
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return (length * width) + (length * Math.sqrt(Math.pow(width/2, 2) + Math.pow(height, 2)))+ (width * (Math.sqrt(Math.pow(length/2, 2) + Math.pow(height, 2))));
    }

    public double getVolume(){
        return (length * width * height)/3;
    }
}
