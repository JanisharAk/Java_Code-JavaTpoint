package JavaArrayProgram;

public class LargestElement {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,9,5,6};
        //Initialize max with first element of array.
        int maxELement = arr[0];  {
            //Loop through the array
            for (int i = 0; i < arr.length; i++) {
                //Compare elements of array with max
                if(arr[i] > maxELement)
                    maxELement = arr[i];
            }
            System.out.println("Largest element present in given array: " + maxELement);
        }
    }
}
