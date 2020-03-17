import java.util.*;

public class smallerNeighbour {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of arraylist");
        int x = scan.nextInt();
        System.out.println("Array 1");
        int[] arey;
        arey= new int[x];
        
        for (int i = 0; i < arey.length; i++) {
            System.out.println("Enter elements in array");
            arey[i] = scan.nextInt();
        }
        List<Integer> al = new ArrayList<Integer>(); 
        int co=0;
        for(int i=0;i<arey.length;i++)
        {
            if(i==0)
            {
                if(arey[i]>arey[i+1]){
                    al.get(arey[i]);
                    
                }
                co++;
            }
            if((co <= 0) && (i >= arey.length - 1))
            {
                if((arey[i]>arey[i+1])&&(arey[i]>arey[i-1]))
                {
                    al.get(arey[i]);
                }
            }
            if(i==arey.length-1){

                if(arey[i]>arey[i-1]){
                    al.get(arey[i]);   
                }
            }
        }
        System.out.println("peak number's ="+al);
    }
    
}