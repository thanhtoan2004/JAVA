package dientichchuvi;

public class Rectangle extends Geometric0bject{
    private double width;
    protected double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public Rectangle(){
        this(1,1);
    }
    public Rectangle(double w, double h){
        this.setHeight(h);
        this.setWidth(w);
    }
    public Rectangle(Rectangle r){
        this.setHeight(r.getHeight());
        this.setWidth(r.getWidth());
    }
    @Override
    public double findArea() {
        return super.findArea();
    }
    @Override
    public double findPerimeter() {
        return super.findPerimeter();
    }
}
