import java.util.Vector;

class CompanyEmployee
{
	//data memebers of the class
	public int id;
	public String name;
    public String Sex;
    public String jobtitle;
    public String organisation;
	
	//constructor
	public CompanyEmployee(int id,String name,String Sex,String jobtitle ,String organisation)
	{
		this.id=id;
		this.name=name; 
        this.Sex=Sex;
        this.jobtitle=jobtitle;
        this.organisation=organisation;
    }
	//putEmployee() to print the values of the employee object
	public void putEmployee()
	{
		System.out.println("Id :"+this.id+"\nName :"+this.name+"\nSex :"+this.Sex+"\nJobtitle :"+this.jobtitle+"\nOrganisation :"+this.organisation);	 
	}
}

//main class 
public class ExampleVector {
	public static void main(String[] args) {	
		Vector V=new Vector(); //Vector class to hold the objects
        
        
        V.add(new CompanyEmployee(100,"Harendra Chekkur",34000)); // adding CompanyEmployee Object to Vector 
		
		//iterating the vector to print the Objects 
		for(Object O:V)
		{   
			/* as Vector holds hetrogeneous data objects thus we have to cast the object to it's type
			in order to do this we are using getName() function which gets the name of the class of the given object 
			and compares it with the given class , if it's matches than typecast the object to that class */
			System.out.println();
			((CompanyEmployee)O).putEmployee();
		}  
	}
}