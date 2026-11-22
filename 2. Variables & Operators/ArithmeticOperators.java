public class ArithmeticOperators {
    public static void main(String[] args) {

        int num=7;
        int num2=5;

        int sum=num+num2;
        System.out.println("Addition: "+sum);

        int diff=num-num2;
        System.out.println("Subtraction: "+diff);

        int product=num*num2;
        System.out.println("Multiplication: "+product);

        int quotient=num/num2;
        System.out.println("Division: "+quotient);

        int remainder=num%num2;
        System.out.println("Remainder: "+remainder);

        num+=2;    //  num=num+2
        System.out.println("num after +=2: "+num);

        num-=2;    //  num=num-2
        System.out.println("num after -=2: "+num);

        num*=2;    //  num=num*2
        System.out.println("num after *=2: "+num);

        num/=2;    //  num=num/2
        System.out.println("num after /=2: "+num);

        num++;   //  post-increment: Similar to, num=num+1
        System.out.println("num after post-increment: "+num);

        ++num;   //  pre-increment: Similar to, num=num+1
        System.out.println("num after pre-increment: "+num);

        num--;   //  post-decrement: Similar to, num=num-1
        System.out.println("num after post-decrement: "+num);

        --num;   //  pre-decrement: Similar to, num=num-1
        System.out.println("num after pre-decrement: "+num);


        // Difference betwen post-increment and pre-increment -
        // Post-increment -> Fetch the value, then increment
        // Pre-increment -> Increment, then fetch the value
        int a=5;
        int result=a++;  // post-increment: result=5, a=6
        System.out.println("Post-increment: result="+result+", a="+a);

        int result2=++a;  // pre-increment: a=7, result2=7
        System.out.println("Pre-increment: result2="+result2+", a="+a);

    }
}
