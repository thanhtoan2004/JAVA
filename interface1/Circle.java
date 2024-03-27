package interface1;

public class Circle {
    protected double radius;
    public Circle(){
        this(1.0);
    }
    public Circle(double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
}
