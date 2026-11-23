public class ForLoop {
    public static void main(String[] args) {
        
        //intialization; condition; updation -> all in a single statement
        for(int i=1;i<=5;i++){
            System.out.println(i);

            for(int j=1;j<=3;j++){
                System.out.println("Hii");
            }
        }

        int k=0;
        for(;k<2;){
            System.out.println("Hello");
            k++;
        }
    }
}
