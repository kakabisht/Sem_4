import java.util.*;

class small2{

    static int getSecondSmallest(int[] a, int total) {
        Arrays.sort(a);
        return a[1];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int x = scan.nextInt();
        int[] arey;
        arey = new int[x];
        for (int i = 0; i < arey.length; i++) {
            System.out.println("Enter elements in array");
            arey[i] = scan.nextInt();
        }
        int ss = getSecondSmallest(arey, x);
        System.out.println("second small ="+ss);
    
    }
  
}
