package JavaArrayProgram;

public class SumOfElement {
    public static void main(String[] args) {

        // Sum of array
        int[] arr = new int[]{1,2,4,3,5,7};
        int sum=0;
        for(int i = 0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
