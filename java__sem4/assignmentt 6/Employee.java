import java.util.*;

public abstract class Employee 
{
    private String name, address;
    static protected int basicSalary;
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void getBasicSalary(){
        System.out.println("yolo");
    }
    public void setAddress(String add){
        address = add;
    }
    public void setName(String nm){
        name = nm;
    }
    public void setBasicSalary(int sal){
        basicSalary = sal;
    }
    public abstract void getMonthlySalary();{

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        NormalEmployee ne=new NormalEmployee();
        System.out.println("Enter his basic salary");
        int sal=sc.nextInt();
        ne.setBasicSalary(sal);
        ne.getMonthlySalary();
        BonusEmployee be= new BonusEmployee();
        be.setBasicSalary(sal);
        be.getMonthlySalary();
    }

}

class NormalEmployee extends Employee{

    public void getMonthlySalary() {
        
        System.out.println("Normal Employee="+basicSalary);
    }    
}
class BonusEmployee extends Employee{

    public void getMonthlySalary() {
        System.out.println("Enter bonus you wish to give");
        Scanner sc = new Scanner(System.in);
        int bonus=sc.nextInt();
        System.out.println("Bonus Employee"+(basicSalary+bonus)); 
    }

}