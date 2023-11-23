package JavaMatrixProgram;

public class TwomatrixProduct_9 {
    public static void main(String[] args) {
        int[][] matrix = {{2,3,4},{4,5,6},{6,7,8}};
        int[][] matrix1 = {{2,3,4},{5,6,7},{3,4,5}};

        //Calculates number of rows and columns present in first matrix
        int  row1 = matrix.length;
        int col1 = matrix[0].length;

        //Calculates the number of rows and columns present in the second matrix

        int row2 = matrix1.length;
        int col2 = matrix1[0].length;

        //For two matrices to be multiplied,
        //number of columns in first matrix must be equal to number of rows in second matrix
        if(col1 != row2){
            System.out.println("Matrices cannot be multiplied");
        }
        else{
            //Array prod will hold the result
            int prod[][] = new int[row1][col2];

            //Performs product of matrices a and b. Store the result in matrix prod
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col2; j++){
                    for(int k = 0; k < row2; k++){
                        prod[i][j] = prod[i][j] + matrix[i][k] * matrix1[k][j];
                    }
                }
            }

            System.out.println("Product of two matrices: ");
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col2; j++){
                    System.out.print(prod[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
