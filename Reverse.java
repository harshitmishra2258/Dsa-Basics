
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        
        for(int num = sc.nextInt();num>0;num/=10){
            int lastDigit = num%10;
            System.out.print(lastDigit);
            
        }
    }
    
}
