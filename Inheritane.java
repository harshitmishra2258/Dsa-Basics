public class Inheritane {
    public static void main(String args[]){
        Fish sharks = new Fish();
        sharks.changeColor();
    }
    
}
class Animals{
    String color;
    int legs;
    void changeColor(){
        System.out.println("No Specific color");

    }
}
class Fish extends Animals{
    int fins;
    void lives(){
        System.out.println("lives in water");
    }
}