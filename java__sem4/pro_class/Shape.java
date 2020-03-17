
import java.util.*; //importing the class;    
class Shape {
    Shape(){
        System.out.print("Welcome to dumb program number 1");
    }

    public int choice(){
        System.out.print("Select a shape \n 1.Square \n 2.Rectangle");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }

}
