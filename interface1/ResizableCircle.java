package interface1;
public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(){
        this(1.0);
    }
    public ResizableCircle(double r){
        super(r);
    }

    public void resize(int percent){
        this.setRadius(this.getRadius() * percent)/100;
    }

}
