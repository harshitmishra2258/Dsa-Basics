import java.util.* ;
public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+"is the Largest");
        }
        else if(b>c ){
            System.out.println(b+" is the Largest");

        }
        else{
            System.out.println(c + " is the largest");
        }
        

    }
    
}
