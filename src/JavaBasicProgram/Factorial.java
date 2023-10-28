package JavaBasicProgram;

public class Factorial {
    public static void main(String[] args) {
        // fact 4 = 4*3*2*1
        //int i = 1;
        int fact=1;
        for(int i = 1; i<=5; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of 5"+" "+ fact);
    }
}
