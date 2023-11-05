package JavaArrayProgram;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,6,7};
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //int[] reverseArray = new int[arr.length];
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
