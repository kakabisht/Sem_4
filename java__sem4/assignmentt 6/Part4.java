import java.util.*;
interface Exam {
    void percent_call();

}
class Student{
    Scanner sc=new Scanner(System.in);
    int mark1 ,mark2;
    void input (){
        System.out.println("enter first marks out of 100");
        this.mark1=sc.nextInt();
        System.out.println("enter Second marks out of 100");
        this.mark2=sc.nextInt();
    }
}
class Part4 extends Student implements Exam {

    void display(){
        System.out.println("Result");
    }

    public void percent_call() {
        System.out.println("Percentage =" + (double)(mark1+mark2)/200);
    }
    public static void main(String[] args) {
        Part4 p4=new Part4();
        p4.input();
        p4.percent_call();
    }
} 
