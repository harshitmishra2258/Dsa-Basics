
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
        // int isPrime = 0;
        if(i==2){
                System.out.println(i+"2 is a Prime num");
                
            }
        for (int n = 2;n <i;n++){
            if (i%n==0){
                System.out.println(i+"  is not a Prime");
                break;
            }
            else if(i%n != 0){
                System.out.println(i+"is a prime ");
                break;
            }
            // else if(i==2){
            //     System.out.println(i+"2 is a Prime num");
            //     break;
            // }
            // System.out.println(i + " is not Prime");
        }
    }
    
}
