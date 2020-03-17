import java.io.*;

class DOB{
  String dob;
  BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
  
  DOB(){

    dob="";
  }

  DOB(String k){
    dob=k;
  }
  public void add() throws IOException{
    System.out.print("Enter date of birth : ");
    dob=br.readLine();
  }
  public void DOBdisplay() throws IOException{
    System.out.println("Date of birth : " +dob);
  }
}

class Classconcept extends DOB{
  int prn;
  String name;
  int number_of_subjects;
  int mark[];


  

  Classconcept() throws IOException{
    prn=0;
    name="";
    number_of_subjects= 0;
    getMarks(0);
  }

  Classconcept(int prnno,String stud_name,int noofsub) throws IOException{
    prn=prnno;
    name=stud_name;
    number_of_subjects= noofsub;
    getMarks(noofsub);
  }

  public void getMarks(int nosub ) throws IOException{
    mark=new int[nosub];
    BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
    for (int i=0; i<nosub;i++){
      System.out.print("Enter "+(i+1)+" Subject Marks : ");
      mark[i]=Integer.parseInt(br.readLine());
      System.out.print("");
      }

  }

  public void calculateMarks() throws IOException{
    double percentage=0;
    String grade;
    int tmarks=0;
    for (int i=0;i<mark.length;i++){
      tmarks+=mark[i];
    }
    percentage=tmarks/number_of_subjects;
    System.out.println("PRN : "+prn);
    System.out.println("Name of Classconcept is : "+name);
    super.DOBdisplay();
    System.out.println("Number Of Subject : "+number_of_subjects);
    System.out.println("Percentage Is : "+percentage);
    System.out.println("");

    if (percentage>=81)
    System.out.println("A");
    else if(percentage>=61 && percentage<80)
    System.out.println("B+");
    else if(percentage>=41 && percentage<60)
    System.out.println("B");
    else if(percentage>=0 && percentage<40)
    System.out.println("C");
    else
    System.out.println("F");
  }
}

class assignment3conceptofclass{
  public static void main(String args[]) throws IOException{
    int prn, no, nostud;
    String name, d;
    BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
    System.out.print("Enter How many Classconcepts : ");
    nostud=Integer.parseInt(br.readLine());
    Classconcept s[]=new Classconcept[nostud];
    DOB a[]=new DOB[nostud];

    for(int i=0;i<nostud;i++){
      System.out.print("PRN : ");
      prn=Integer.parseInt(br.readLine());
      System.out.print("Enter Name : ");
      name=br.readLine();
      a[i]=new Classconcept();
      a[i].add();
      System.out.print("Enter No of Subject : ");
      no=Integer.parseInt(br.readLine());
      s[i]=new Classconcept(prn,name,no);
      System.out.println("");
    }

    for(int i=0;i<nostud;i++){
      s[i].calculateMarks();
    }
  }
}
