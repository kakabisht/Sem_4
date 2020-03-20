import java.util.*;
import java.io.*;

class Circle{
    int x,y,r;
    Circle()
    {
        this.x=0;
        this.y=0;
        this.r=0;
    }
    Circle(int x, int y, int r)
    {
        this.x=x;
        this.y=y;
        this.r=r;
    }
    Circle (int x, int r)
    {
        this.x=x;
        this.y=x;
        this.r=r;
    }
    void display()
    {
        System.out.println("\nX="+x+"\nY="+y+"\nR="+r);
    }
}
public class Constructor1 {

    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        int x,y,r;
        System.out.println("Enter center co-ordinates of circle");
        x=sc.nextInt();y=sc.nextInt();
        System.out.println("Enter radious of circle ");
        r=sc.nextInt();  
        Circle ci =new Circle(x,y,r);
        ci.display();
        Circle ci1 =new Circle();
        ci1.display();
        Circle ci2 =new Circle(x,r);
        ci2.display();
        
    }
        
}