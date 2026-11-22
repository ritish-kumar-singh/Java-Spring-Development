public class Literals {
    public static void main(String[] args) {
        
        //literals

        int num1= 0b101;    // binary number - 5
        System.out.println(num1);

        int num2=0x7E;   // hexadecimal number - 126
        System.out.println(num2);

        int num3 = 10_00_000; // we can put underscore in between the number to make it more readable 

        double num=12e10; // scientific notation - 12*10^10
        System.out.println(num);

        // boolean b=1; // this will cause a compilation error - boolean literals are only true or false

        char c='A'; // character literal
        System.out.println(c);

        c++; // incrementing the character literal
        System.out.println(c); // prints B

    }
}
