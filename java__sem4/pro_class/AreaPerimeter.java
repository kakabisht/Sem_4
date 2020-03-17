
import java.util.*; //importing the class;    


class Shape {
    Shape(){
        System.out.print("Welcome to dumb program number ");
    }

    int choice(){
        System.out.print("Select a shape \n 1.Square \n 2.Rectangle");
        Scanner scan = new Scanner(System.in);
        int cho = scan.nextInt();
        return cho;
    }

}
 class Rectangle extends Shape {

    Rectangle(){
        super();
        System.out.println("YOLO Rectangle");
        
    }

    void Rarea(int x,int y){

        System.out.println("Area of Rectangle ="+(x*y));
    }

    void Rperimeter(int x , int y){

        System.out.println("Perim eter of Rectangle  ="+ 2*(x+y));
    }    
}

class Square extends Shape {

    Square(){
        super();
        System.out.println("YOLO Sqauro");
        
    }

    void Sarea(int x){

        System.out.println("Area of Square ="+(x*x));
    }

    void Sperimeter(int x){

        System.out.println("Perimeter of Square ="+(4*x));
    }

    
}




public class AreaPerimeter{

    public static void main(String args[]) {

        Shape obj1 =new Shape();
        int i =obj1.choice();
        if (i==2){
            Rectangle re= new Rectangle();
            System.out.println("enter input for rectangle");
            Scanner inr = new Scanner(System.in);
            int l = inr.nextInt();//used to read data
            int b = inr.nextInt();//used to read dat
            re.Rarea(l, b);
            re.Rperimeter(l, b);
        }

        else if(i==1){
        
            Square se= new Square();
            System.out.println("enter input for square");
            Scanner ins = new Scanner(System.in);
            int s = ins.nextInt();//used to read dat
            se.Sarea(s);
            se.Sperimeter(s);
        
        }
    }

}

