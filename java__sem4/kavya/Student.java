import java.util.*;
import java.io.*;

class DoB
{
	int date;
	int month;
	int year;
	void getdob()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date, month and year of birth respectively:");
		date=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
	}
	void putdob()
	{
		System.out.println("Date of Birth: "+date+"/"+month+"/"+year);
	}
}

class Student extends DoB 
{
	static int c=0; 
	int prn;
	String name;
	float marks[]=new float[3];
	Scanner sc = new Scanner(System.in);
	
	void add()
	{	
		System.out.print("Name: ");
		name=sc.next();
		System.out.print("PRN: ");
		prn=sc.nextInt();
		System.out.println("Enter marks in each subject: ");
		for(int i=0;i<3;i++)
		{
			System.out.print("Subject "+(i+1)+":");
			marks[i]=sc.nextFloat();
		}
		super.getdob();
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("PRN: "+prn);
		System.out.println("Marks:\nSubject 1: "+marks[0]+"\nSubject 2: "+marks[1]+"\nSubject 3: "+marks[2]);
		super.putdob();
	}
	
	public static void main(String args[])throws IOException
	{
		Student s[] = new Student[10];
		Scanner scm = new Scanner(System.in);
		char ans='y';
		String g;
		int ch,x,y,flag=0;
		float tm;
		
		while(ans=='y')
		{
			System.out.print("\t\t\tMAIN MENU (Student Record)\n1. Add\n2. Display\n3. Search\n4. Update\n5. Delete\n6. Grade-wise Classification\nEnter choice: ");
			ch=scm.nextInt();
			switch(ch)
			{
				case 1: System.out.print("Enter number of students you want to add: ");
						x=scm.nextInt();
						for(int i=0;i<x;i++)
						{
							System.out.println("Enter details of student "+(c+1)+":");
							s[c]=new Student();
							s[c].add();
							c++;
						}
						break;
				case 2: System.out.print("The details of all students are:\n");
						for(int i=0;i<c;i++)
						{
							System.out.println("\nStudent "+(i+1)+":");
							s[i].display();
						}
						break;		
				case 3:	System.out.print("Enter PRN of student you want find: ");
						x=scm.nextInt();
						flag=0;
						for(int i=0;i<c;i++)
						{
							if(s[i].prn==x)
							{
								flag++;
								System.out.print("The details of all students with prn "+x+" are:\n");
								s[i].display();
							}
						}	
						if(flag==0)
						System.out.print("Student NOT found in record!!!");
						break;
				case 4: System.out.print("Enter PRN of student you want update: ");
						x=scm.nextInt();
						for(int i=0;i<c;i++)
						{
							if(s[i].prn==x)
							{
								flag++;
								System.out.print("Enter new details of student\n");
								s[i].add();
								break;
							}
						}	
						if(flag==0)
						System.out.print("Student NOT found in record!!!");
						break;	
				case 5: System.out.print("Enter PRN of student you want delete: ");
						x=scm.nextInt();
						for(int i=0;i<c;i++)
						{
							if(s[i].prn==x)
							{
								flag++;
								for(int j=i;j<c-1;j++)
								{
									s[j]=s[j+1];
								}
								System.out.print("\nStudent Record Deleted.");
								c--;
								break;
							}
						}	
						if(flag==0)
						System.out.print("Student NOT found in record!!!");		
						break;
				case 6: System.out.print("\nThe grades of all students are:\n");
						for(int i=0;i<c;i++)
						{
							tm=(s[i].marks[0]+s[i].marks[1]+s[i].marks[2])/3;
							if(tm>=81)
								g="A";
							else if(tm>=61)
								g="B+";
							else if(tm>=41)
								g="B";
							else if(tm==40)
								g="C";
							else
								g="F";
							System.out.println(s[i].name+": "+g);
						}
						break;
			}
			System.out.print("\nDo you want to continue?(y/n): ");
			ans=scm.next().charAt(0);
		}
	}
}