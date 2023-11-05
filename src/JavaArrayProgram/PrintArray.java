package JavaArrayProgram;

import java.util.Arrays;

public class PrintArray {
    //copy an array into another array
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr)); // this is direct method to print Array

        // we will use LOOP here

        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
