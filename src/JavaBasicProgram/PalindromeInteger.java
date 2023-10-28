package JavaBasicProgram;
// A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343,
// string form MADAM
public class PalindromeInteger {
    public static void main(String[] args) {

        int remaind;
        int sum=0;
        int temp; // we will assign given num to temp variable
        int num = 454; //It is the number variable to be checked for palindrome

        temp=num; // here we are assigning num to temp
        while(num > 0){
            remaind =num%10;  //getting remainder
            sum=(sum*10)+remaind;
            num=num/10;
        }
        if(temp==sum)
            System.out.println("palindrome number");
        else
            System.out.println("not palindrome");
    }
}
