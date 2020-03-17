import java.io.*;
import java.util.jar.Attributes.Name;

class Employee_buffer {

    public static void main(String [] kaka) {
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       
        try {
            System.out.println("Name");
            String name = br.readLine();       
            System.out.println("Id");
            int id = Integer.parseInt(br.readLine());       
            System.out.println("Name --> "+name+" \n ID -->" + id);
            br.close();     
        } catch (Exception e) {
            System.out.println("Error");   
    
        }      
    }
        
}
    
    
