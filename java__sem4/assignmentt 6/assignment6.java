import java.util.*;


abstract class Shape
{
    protected int dim1,dim2,dim3,numSides;

    Shape()
    {
        this.numSides=0;
        this.dim1=0;
        this.dim2=0;
        this.dim3=0;
    }
    Shape(int NumSides,int dim1 ,int dim2, int dim3)
    {
        this.numSides=numSides;
        this.dim1=dim1;
        this.dim2=dim2;
        this.dim3=dim3;
    }
    
    public int getNumSides() 
    {
        return numSides;
    }
    abstract void getarea();

    abstract public void getperimeter();
}

class Rectangle extends Shape {

    protected int dim1, dim2;
    Rectangle(){
        dim1=0;dim2=0;

    }
    Rectangle(int dim1 , int dim2){
        this.dim1=dim1;
        this.dim2=dim2 ;
    }

    void getarea() {
        System.out.println("\n Area of Rectangle =" + (dim1 * dim2));
    }

    public void getperimeter() 
    {
        System.out.println("\n Perimeter of Rectangle =" + 2*(dim1 + dim2));
    }

}

class RtTriangle extends Shape {

    protected int dim1, dim2;
    RtTriangle(){
        dim1=0;dim2=0;

    }
    RtTriangle(int dim1 , int dim2, int dim3){
        this.dim1=dim1;
        this.dim2=dim2 ;
        this.dim3=dim3;

    }

    void getarea() {
        System.out.println("\n Area of RtTriangle =" + (dim1 * dim2)/2);
    }

    public void getperimeter() 
    {
        System.out.println("\n Perimeter of RtTriangle =" +(dim1+dim2+Math.sqrt(Math.pow(dim1, 2)+Math.pow(dim2, 2))));
    }

}
class  Circle extends Shape {
    final double pi=  3.14;

    protected int dim1, dim2;
    Circle(){
        dim1=0;

    }
    Circle(int dim1 ){
        this.dim1=dim1;
    }

    void getarea() {
        System.out.println("\n Area of Circle =" + (Math.pow(dim1, 2)*pi));
    }
    public void getperimeter() 
    {
        System.out.println("\n Perimeter of Circle =" +(2*dim1*pi));
    }

}

public class assignment6 {

    public static void main(String[] args) {
        System.out.println("Enter Number of Sides ");
        Scanner sc= new Scanner (System.in);
        int x=sc.nextInt();
        if(x==1)
        {
            System.out.println("Enter sides");
            int r=sc.nextInt();
            Circle ci= new Circle(r);
            ci.getarea();
            ci.getperimeter();
        }
        if(x==2)
        {
            System.out.println("Enter sides");
            int l=sc.nextInt();
            int b=sc.nextInt();
            Rectangle re= new Rectangle(l,b);
            re.getarea();
            re.getperimeter();
        }
        if(x==3)
        {
            System.out.println("Enter sides");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            RtTriangle rt= new RtTriangle(a,b,c);
            rt.getarea();
            rt.getperimeter();
        }
        
    }        
}



    
