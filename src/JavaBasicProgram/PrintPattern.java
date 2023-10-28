package JavaBasicProgram;

public class PrintPattern {
    public static void main(String[] args) {


//outer loop for rows
        for(int i=0; i<4; i++)
        {
//inner loop for columns
            for(int j=0; j<=i; j++)
            {
//prints stars
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
