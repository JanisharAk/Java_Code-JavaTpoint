package JavaArrayProgram;

public class DuplicateElement {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,3,4,5,6,8,6,4,1};
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}