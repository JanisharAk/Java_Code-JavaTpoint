package JavaArrayProgram;

public class evenOddElement {
    public static void main(String[] args) {

        int[] arr = new int[]{6, 5, 6, 2, 3, 8};

        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // EVEN NUMBERE
        System.out.println();
        System.out.println("Even number");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Odd number");
        // ODD NUMBER
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                System.out.print(arr[i]+ " ");
            }
        }

    }
}
