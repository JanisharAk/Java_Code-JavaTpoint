package JavaArrayProgram;
import java.util.*;
public class SortAnArray {
    // Two ways to sort Either use builtin Method or Loop
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,9,5,6};
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
