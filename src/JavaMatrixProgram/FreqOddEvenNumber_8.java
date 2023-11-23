package JavaMatrixProgram;

public class FreqOddEvenNumber_8 {
    public static void main(String[] args) {
        int[][] matrix = {{2,3,4},{4,5,6},{6,7,8}};
        int evenCount =0;
        int oddCount = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        if(row!=col){
            System.out.println("Not a matrix");
        }
        else{
            for(int i =0; i<row; i++){
                for(int j =0; j<col; j++){
                    if(matrix[i][j]%2==0){
                        evenCount++;
                    }
                    else
                        oddCount++;
                }
            }

            System.out.println("Frequency of even numbers: " + evenCount);
            System.out.println("Frequency of odd numbers: " + oddCount);
        }
    }

}
