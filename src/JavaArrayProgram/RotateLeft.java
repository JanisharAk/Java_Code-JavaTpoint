package JavaArrayProgram;

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,4,5}; // rotate array 2 times in left
        int n = arr.length;
        int rotateTime = 2;
        // print original array
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        //Rotate the given array by n times toward left
        for(int i = 0; i < rotateTime; i++) {
            int j, first;
            //Stores the first element of the array
            first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                //Shift element of array by one
                arr[j] = arr[j + 1];
            }
            //First element of array will be added to the end
            arr[j] = first;
        }

        System.out.println();
        //Displays resulting array after rotation
        System.out.println("Array after left rotation: ");
        for(int i = 0; i< n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
