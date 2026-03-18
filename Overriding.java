public class Overriding {
    public static void main(String[] args) {
        Animals a1 = new Animals();
        a1.eats();
        Lions l1 = new Lions();
        l1.eats();
    }
    
}
class Animals{
    void eats(){
        System.out.println("Eats anything");
    }
}
class Lions extends Animals{
    void eats(){
        System.out.println("Eats meats ");
    }
}