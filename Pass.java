import java.util.* ;
public class Pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String result=score>=35?"Studentpass":"Studentfail";
        System.out.println(result);
    }
    
}
