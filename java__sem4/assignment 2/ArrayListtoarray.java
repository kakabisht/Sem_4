import java.util.*;
class   ArrayListtoarray{ 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of arraylist");
        int x = scan.nextInt();
        List<Integer> al = new ArrayList<Integer>(); 
        for(int i=0;i<x;i++)
        {
            System.out.println("Enter the element of arraylist");
            int y= scan.nextInt();
            al.add(y);    
        }
        Object[] objects = al.toArray(); 
  
        // Printing array of objects 
        for (Object obj : objects) 
            System.out.print(obj + " ");  
    }
}