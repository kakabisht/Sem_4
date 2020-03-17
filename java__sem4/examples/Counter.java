import java.util.*;
class Counter{  
static int count=0;//will get memory when instance is created  
  
Counter(){  
count++;  
System.out.println(count);  
}  
  
public static void main(String args[]){  
  
    String states[] = new String[2];

    Scanner inp = new Scanner(System.in);
    
    for(int i=0; i<states.length; i++)
    
    states[i]=inp.nextLine();
    
    for(int i=0; i<states.length; i++)
    
    System.out.println(states[i]);
    
    for(String element : states)
    
    System.out.println(element);
  
}}