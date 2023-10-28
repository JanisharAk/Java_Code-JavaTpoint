package JavaBasicProgram;
// total 5 ways to create object in java
// 1.   Using new Keyword
// 2.   Using clone() method
// 3.   Using newInstance() method of the Class class
// 4.   Using newInstance() method of the Constructor class
// 5.   Using Deserialization
public class VariousObjectCreation {
    void show() {
        System.out.println(" object called using new keyword");
    }

    public static void main(String[] args) {
//creating an object using new keyword
        VariousObjectCreation obj = new VariousObjectCreation();
//invoking method using the object
        obj.show();
    }
}
