
import java.util.Scanner;

public class breakstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for (int i = sc.nextInt(); i > 0; i++) {
        //     if (i%10==0){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        int i = sc.nextInt();

        do { 
            if(i%10==0){
                break;
            }
            System.out.println(i);
            i++;
        } while (true);
    }
    
}
