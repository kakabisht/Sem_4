import java.util.*;

public class duplicate {


    public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }    

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
        int j = 0;  
        int length = arey.length;  
        length = removeDuplicateElements(arey, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arey[i]+" ");  
    }
    
}