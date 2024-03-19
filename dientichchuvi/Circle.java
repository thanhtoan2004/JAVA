package dientichchuvi;

public class Circle extends Geometric0bject
{
    private double radius;
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public Circle()
    {
        this(1.0);
    }
    public Circle(double radius)
    {
        this.setRadius(radius);
    }
    public Circle(Circle c)
    {
        this.setRadius(c.getRadius());
    }

    public double findArea()
    {
        return Math.PI * this.getRadius() * this.getRadius();
    }
    public double findPerimeter()
    {
        return 2 * Math.PI * this.getRadius();
    }
}
