public class Diamondpattern {
    public static void DiamondPattern(int lines){
        int k=0;
        for (int i = 1; i <= lines; i++) {
            
            for (int j = 1; j <= lines-i; j++){
                System.out.print(" ");
            } 
            for (int j = 1; j <= i+k; j++) {
                System.out.print("*");
            }
            System.out.println();
            k++;

        }
        int m =lines-1;
        for (int i = lines; i >= 0; i--) {
            for (int j = 1; j <= lines-i; j++){
                System.out.print(" ");
            } 
            for (int j = 1; j <= i+m; j++) {
                System.out.print("*");
            }
            System.out.println();
            m-- ;
            
        }
    }
    public static void main(String[] args) {
        DiamondPattern(5);
    }
    
}
