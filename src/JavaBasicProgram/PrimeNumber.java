package JavaBasicProgram;
// prime number 2 3 5 7 between 1 to 10
public class PrimeNumber {
    public static void main(String[] args) {
        int i, j, count;

        System.out.println("Prime Numbers from 1 to 10");
        for (i = 2; i <= 10; i++) {
            count = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0)
                System.out.print(i+" ");
        }
    }
}