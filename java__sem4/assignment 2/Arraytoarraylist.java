import java.util.*;
     
class Arraytoarraylist{
     
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
        List<Integer> list2 = new ArrayList<Integer>();
        for(int text:arey) {
           list2.add(text);
        }
        System.out.println(list2);
     }  
}