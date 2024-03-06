package thanhtoan_2280603288;
public class Cylinder extends Circle{
    private double length;
    public double getLength(){
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public Cylinder(){
        this( 1.0,  1.0);
    }
    public Cylinder(double radius, double length){
        super(radius);
        this.setLength(length);
    }
    public Cylinder(Cylinder c){
        this(c.getRadius(), c.getLength());
    }
    public double findVolume  (){
        return this.findArea() * this.getLength();
    }
    public String toString(){
        return "Cylinder[radius="+this.getRadius()+", length= "+this.getLength()+", Volume="+this.findVolume()+"]";
    }
}
