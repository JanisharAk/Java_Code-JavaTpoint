package JavaArrayProgram;

public class LowestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,5,7,1,2};
        int minElemnet = arr[0]; // you are declaring a variable named minElement of type int (integer) and
                         // initializing it with the value of the first element in an array called arr
        for(int i = 0; i<arr.length; i++) {
            if (arr[i] < minElemnet)
                minElemnet = arr[i];
        }
            System.out.print("Lowest element present in given array: " + minElemnet);
    }
}
