package thanhtoan_2280603288;
public class Circle {
    private double radius;
    public Circle(){
        this(1.0f);
    }
    public Circle(double radius){ this.setRadius(radius);}
    public double getRadius() {return this.radius;}
    public void setRadius(double r) {
        this.radius = r>0?r:1.0;
    }
    public double findArea(){return radius * radius * Math.PI;}
    public double findPerimeter() {
        return 2*Math.PI * radius;
    }
}
