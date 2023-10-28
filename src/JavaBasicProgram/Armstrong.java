package JavaBasicProgram;
import java.util.*;
//3: 31 = 3
//153: 13 + 53 + 33 = 1 + 125+ 27 = 153
//125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
//1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643
public class Armstrong {
    public static void main(String[] args) {
        int number = 371;
        int originalNumber;
        int remainder;
        int result = 0;

        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

    }
}
