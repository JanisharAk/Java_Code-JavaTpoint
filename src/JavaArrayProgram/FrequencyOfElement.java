package JavaArrayProgram;

public class FrequencyOfElement {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,2,3,4,2,3,2};// defining array

        int n  = arr.length; // Length of array
        int [] freq = new int [n]; // Array freq will store frequency
        int visited = -1;
        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                    //To avoid counting same element again
                    freq[j] = visited;
                }
            }
            if(freq[i] != visited)
                freq[i] = count;
        }
        //Displays the frequency of each element present in array
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + freq[i]);
        }
        System.out.println("----------------------------------------");

    }
}
