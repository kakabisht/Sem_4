
public class Rectangle extends Shape {

    Rectangle(){
        super();
        System.out.println("YOLO Rectangle");
        
    }

    public void Rarea(int x,int y){

        System.out.println("Area of Rectangle ="+(x*y));
    }

    public void Rperimeter(int x , int y){

        System.out.println("Perim eter of Rectangle  ="+ 2*(x+y));
    }    
}

