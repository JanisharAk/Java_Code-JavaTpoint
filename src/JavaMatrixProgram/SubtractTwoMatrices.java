package JavaMatrixProgram;

public class SubtractTwoMatrices {
    public static void main(String[] args) {

        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{2, 1, 7}, {7, 8, 9}, {1, 2, 3}};
        // create another matrix to store multipilcation
        int[][] mul = new int[3][3];


        //Subtract two matrices of 2 matrices
        System.out.println("Subtract two matrices");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                mul[row][col] = mat1[row][col] - mat2[row][col];    //use - for subtraction
                System.out.print(mul[row][col] + " ");
            }
            System.out.println();//new line
        }
    }
}
