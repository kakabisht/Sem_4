    
import pkg_Stack.*;
interface Interface_STK{  
    void display();  
}  
class Try implements Interface_STK{  
    public void display(){System.out.println("Interface_STK");}        
    public static void main(String args[]){  
    Try obj = new Try();  
    obj.display();
    pkg_Stack.Fixed_stk fS=new pkg_Stack.Fixed_stk();
    fS.display(); 
    pkg_Stack.Growable_stk gS=new pkg_Stack.Growable_stk();
    gS.display();  
    }  
}  