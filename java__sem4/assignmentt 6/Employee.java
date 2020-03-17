import java.util.*;

public abstract class Employee 
{
    private String name, address;
    protected int basicSalary;
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
        NormalEmployee ne=new NormalEmployee();
        ne.basicSalary=1000;
        ne.getMonthlySalary();
        BonusEmployee be= new BonusEmployee();
        be.basicSalary=1000;
        be.getMonthlySalary();
    }

}

class NormalEmployee extends Employee{

    public void getMonthlySalary() {
        
        System.out.println(basicSalary);
    }    
}
class BonusEmployee extends Employee{

    public void getMonthlySalary() {
        System.out.println("Enter bonus you wish to give");
        Scanner sc = new Scanner(System.in);
        int bonus=sc.nextInt();
        System.out.println(basicSalary+bonus); 
    }

}