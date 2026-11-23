public class DoWhileLoop {
    public static void main(String[] args) {
        
        int i=1;

        do{
            System.out.println("Hello");
            i++;
        }while(i<=3);

        int j=1;
        do{ 
            // it will run atleast once despite of the condition being true or false
           System.out.println("Hii");
            j++;
        }while(j<0);

    }
}
