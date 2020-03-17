import java.util.*;

class oddoreven{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int oddno=0,evenno=0;
        int [] odd;
        odd= new int[5];
        int [] even;
        even= new int[5];
        int x= scan.nextInt();
        if (x%2==0) {
            System.out.println("Even");
            even[evenno]=x;
            evenno++;
        }
        else {
            System.out.println("ODD");
            even[oddno]=x;
            oddno++;    
        }
        
        for(int i:even)
        {
            System.out.println("Even ="+i);
        }

        for(int i:odd)
        {
            System.out.println("Odd ="+i);
        }
    }


}