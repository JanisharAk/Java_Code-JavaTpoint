package JavaArrayProgram;

public class CopyElementToArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5}; // define the size of array
        int n = arr.length; // defining length
        int[] copyArray = new int[n];  // creating a copy array here
        for(int i =0; i<n; i++){
            copyArray[i] =  arr[i]; // here im inserting arr value to CopyArray
            System.out.print(copyArray[i]+",");
        }
    }
}
