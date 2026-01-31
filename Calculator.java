
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        System.out.println("Chose from this *,+,-,/,%");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':System.out.println(firstNum+secondNum);
                break;
            case '-':System.out.println(firstNum-secondNum);
                break;
            case '*':System.out.println(firstNum*secondNum);
                break;
            case '/':System.out.println(firstNum/secondNum);
                break;
            case '%':System.out.println(firstNum%secondNum);
                break;

            default:
                System.out.println("You ave enter a wrong input");
                throw new AssertionError();
        }
    }
    
}
