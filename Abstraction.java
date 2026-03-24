public class Abstraction{
    public static void main(String[] args) {
        Horse h1= new Horse();
        h1.legsContains();
        h1.eats();
        
        
    }
}
abstract class Animal{
    void eats(){
        System.out.println("All Animals eats ");
    }
    abstract void legsContains();
}
class Horse extends Animal{
    void legsContains(){
        System.out.println("Horse has four legs.");
    }

}