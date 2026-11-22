public class TypeConversion {
    public static void main(String[] args) {
        
        byte b=127;
        System.out.println(b);

        int a1=2;
        byte c1=(byte)a1;
        System.out.println(c1);


        int a=257;  // out of range for byte
        byte c=(byte)a;
        System.out.println(c);

        float f=10.5f;
        int i=(int)f; // explicit type casting
        System.out.println(i);


        //Type Promotion
        byte b1=10;
        byte b2=30;

        int product=b1*b2; // byte * byte = int
        System.out.println(product);

    }
}
