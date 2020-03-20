import java.io.*;
import java.util.*;

class Person{
 
    static int noOfObjects = 0; 
    { 
        noOfObjects += 1; 
    } 
    int Notstatic=0;
    String name;
    int age;
    double salary ;
    Person(){
        this.name="";
        this.age=0;
        this.salary=0;
        Notstatic+=1;
    }
    Person(String name , int age , double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
        Notstatic+=3;
    }

    Person(String name , double salary){
        this.name=name;
        this.salary=salary;
        Notstatic+=2;
    }

    void display()
    {
        System.out.println("\nName="+name+"\nAge="+age+"\nSalary="+salary);
        System.out.println(" \nNotstatic value \n1 for default constructor called \n 2 for 2 paratmeters object \n 3 for 3 parameters object = \n "+Notstatic);
    }
}
public class StaticUse {

    public static void main(String[] args) {
        
        String name ;
        int age;
        double salary ;
        System.out.println("Welcome to Person Database");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the name");
        name=sc.nextLine();
        System.out.println("\nEnter the age");
        age=sc.nextInt();
        System.out.println("\nEnter the salary");
        salary=sc.nextDouble();
        Person pq=new Person(name, age, salary);
        pq.display();
        System.out.println("\n New Object \n");
        Person pe=new Person(name,salary);
        pe.display();
        System.out.println(" \n No of objects="+Person.noOfObjects);
    }
}