public class WhileLoop {
    public static void main(String[] args) {

        int count = 1;  // initialization

        while (count <= 5) {    // condition
            System.out.println("Count is: " + count);
            
            int i=1;
            while(i<=3){
                System.out.println("Hello");
                i++;
            }

            count++;    // updation
        }

    }
}
