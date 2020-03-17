/*
W.a.p which performs sorting of group of integer values using bubble sort & Quick Sort
.Use Array List.
*/
import java.util.*;

public class sorthaijava {

    static void swap(Object object, Object object2) {

        Object temp = object;
        object = object2;
        object2 = temp;
    }
  
    static int partition(List<Integer> al, int low, int high) {
        int pivot = al.get(high);
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (al.get(j) < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = al.get(i);
                al.set(i, al.get(j));
                al.set(j, temp);

            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = al.get(i + 1);
        al.set(i + 1, al.get(high));
        al.set(high, temp);
        return i + 1;
    }

    /*
     * The main function that implements QuickSort() arr[] --> Array to be sorted,
     * low --> Starting index, high --> Ending index
     */
    static void sorts(List<Integer> al, int low, int high) {
        if (low < high) {
            /*
             * pi is partitioning index, arr[pi] is now at right place
             */
            int pi = partition(al, low, high);

            // Recursively sort elements before
            // partition and after partition
            sorts(al, low, pi - 1);
            sorts(al, pi + 1, high);
        }
    }

    static void bubblesort(List<Integer> al) {

        int n = al.size();
        for (int k = 0; k < n - 1; k++) {

            for (int l = 0; l < n - k - 1; l++) {

                int diff = (int) (al.get(l) - al.get(l + 1));
                if (diff > 0) {
                    // swap(al.get(l), al.get(l + 1));
                    int temp = al.get(l);
                    al.set(l, al.get(l + 1));
                    al.set(l + 1, temp);

                }
            }

        }
        System.out.println(al);

    }

    static void quicksort(List<Integer> al) {

        sorts(al, 0, al.size() - 1);
        System.out.println(al);


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of arraylist");
        int x = scan.nextInt();
        List<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < x; i++) {
            System.out.println("Enter the element of arraylist");
            int y = scan.nextInt();
            al.add(y);
        }
      //  bubblesort(al);
        quicksort(al);
        

    }

    
}