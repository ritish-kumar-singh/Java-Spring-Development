public class LogicalOperators {
    public static void main(String[] args) {
        
        int x=7;
        int y=5;
        int a=5;
        int b=9;

        boolean result1 = (x > y) && (a < b); // true && true => true
        boolean result2 = (x < y) && (a < b); // false && true => false
        boolean result3 = (x > y) || (a > b); // true || Won't check the second one => true
        boolean result4 = !(a > b); // !(false) => true

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
    }
}
