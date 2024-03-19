package dientichchuvi;
public class Test0bject
{
    public static void main(String[] args)
    {
        Geometric0bject[] objects = new Geometric0bject[3];
        objects[0]= new Rectangle(1, 1);
        objects[1]= new Circle(4);
        objects[2]= new Rectangle(1, 1);
        double tongdientich = 0, tongchuvi = 0;
        for(Geometric0bject o: objects){
            tongchuvi += o.findPerimeter();
            tongdientich += o.findArea();
        }
        System.out.println("Tổng diện tích là : "+tongdientich);
        System.out.println("Tổng chu vi là : "+tongchuvi);

    }
}
