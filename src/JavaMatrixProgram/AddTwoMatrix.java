package JavaMatrixProgram;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int[][] row = {{1,3,4},{2,4,3},{3,4,5}};
        int[][] col = {{1,2,3},{3,4,5},{6,7,8}};

        //creating another matrix to store the sum of two matrices
        int c[][] = new int[3][3];  //3 rows and 3 columns

      //adding and printing addition of 2 matrices
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=row[i][j]+col[i][j];    //use - for subtraction
                System.out.print(c[i][j]+" ");
            }
            System.out.println();//new line
        }
    }
}
