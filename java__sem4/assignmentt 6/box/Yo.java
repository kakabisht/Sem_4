package box;
import java.util.*;
public class Yo {

    public int x,y,z;
    Scanner sc= new Scanner(System.in);
    public void input(){
        System.out.println("length");
        x=sc.nextInt();

        System.out.println("Breadth");
        y=sc.nextInt();

        System.out.println("Height");
        z=sc.nextInt();
    }
    public void disp(){
        System.out.println("length="+x);
     
        System.out.println("Breadth="+y);

        System.out.println("Height="+z);
    }
    public static void main(String[] args) {
        Yo obj=new Yo();
    }
    
    
}