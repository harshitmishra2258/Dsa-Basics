import java.util.*;

public class continuestatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = sc.nextInt();i<=99;i++){
            if(i%10==0){
                continue;
            }
            System.out.println(i);
        }

    }
    
}
