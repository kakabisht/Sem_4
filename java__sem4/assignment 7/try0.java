
public class try0 {

    static {
     
        System.err.println("\n A rational number is a number in the form of a/b ,  where a and b are integers and b != 0");
    
    }
    public static void main(String [] args) {
        
        System.out.println("First rational number :"+args[0]+"/"+args[1]);
        System.out.println("Second rational number :"+args[2]+"/"+args[3]);
       
        int iargs[]=new int[4];//declaration and instantiation  
        
        try {
        
            iargs[0]=Integer.parseInt(args[0]);
            iargs[1]=Integer.parseInt(args[1]);
            iargs[2]=Integer.parseInt(args[2]);
            iargs[3]=Integer.parseInt(args[3]);
        
        } 
        catch (Exception e)
        {
            System.out.println("\n Error at String ARGS " + e.getMessage());    
        } 

        if (iargs[1]==0)
        {
            System.out.print("\n First Number is not a rational number");
        }
        
        if (iargs[3]==0)
        {
            System.out.print("\n Second Number is not a rational number");
        }
        
        try {   
         
            int num=iargs[0]*iargs[3]+iargs[1]*iargs[2];
            int den=iargs[1]*iargs[3];
            System.out.print("\n Add :"+num+"/"+den);

            try {
                int result=num/den;
                System.out.print("\n Add result"+result);
            }
            catch(Exception e)
            {
                System.out.println("\n Error at ADD result=" + e.getMessage());    
            }
        
        }
        catch (Exception e) 
        {
            System.out.println("\n Error at ADD" + e.getMessage());
        }
        
        try {
        
            int num=iargs[0]*iargs[3]-iargs[1]*iargs[2];
            int den=iargs[1]*iargs[3];
            System.out.print("\n Sub :"+num+"/"+den);
        
            try {
                int result=num/den;
                System.out.print("\n Sub result="+result);
            }
            catch(Exception e)
            {
                System.out.println("\n Error at Sub result " + e.getMessage());    
            }

        } 
        catch (Exception e) 
        {
            System.out.println("\n Error at Sub" + e.getMessage());
        }

        try {

            int num=iargs[0]*iargs[2];
            int den=iargs[1]*iargs[3];
            System.out.print("\n MUl :"+num+"/"+den);
            try {
                int result=num/den;
                System.out.print("\n Multiply result="+result);
            }
            catch(Exception e)
            {
                System.out.println("\n Error at Mul result " + e.getMessage());    
            }

        } catch (Exception e) 
        {
            System.out.println("\n Error at MUl" + e.getMessage());
        } 
        try {

            int num=iargs[0]*iargs[3];
            int den=iargs[1]*iargs[2];
            System.out.print("\n Div :"+num+"/"+den);
        
            try {
                int result=num/den;
                System.out.print("\n Div result="+result);
            }
            catch(Exception e)
            {
                System.out.println("\n Error at Div result " + e.getMessage());    
            }

        } 
        catch (Exception e) 
        {
            System.out.println("\n Error at Div" + e.getMessage());
        }
    }
    
}