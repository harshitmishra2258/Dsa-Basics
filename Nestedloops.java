
import java.util.Scanner;

public class Nestedloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for (int i=1;i<=5;i++){
        //     for(int line=1;line<=i;line++){
        //         System.out.print("$");
        //     }
        //     System.out.println("");
        // }
        // for (int i=1;i<=5;i++){
        //     for(int star=5;star>=i;star--){
        //         System.out.print("!");
        //     }
        //     System.out.println("");
        // }
        for (int i= 1;i>=10;i++){
            for(int n=1;n<=i;n++){
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
    
}
