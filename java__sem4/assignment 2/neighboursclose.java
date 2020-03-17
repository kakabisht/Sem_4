import java.util.*;

class neighboursclose{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int x= scan.nextInt();
        int [] arey;
        arey= new int[x];
        for(int i=0;i<arey.length;i++)
        {
            System.out.println("Enter elements in array");
            arey[i]=scan.nextInt();
        }

        int smallest = Math.abs(arey[0]-arey[1]);
        int index = 0;
        for(int j=0; j<arey.length-1; j++)
        {

            int value = Math.abs(arey[j]-arey[j+1]);
            if(value<= smallest){
                smallest= value;
                index = j;
            }
               
        }
        System.out.println("small"+smallest);
        System.out.println("index"+index);  
      


    }
}