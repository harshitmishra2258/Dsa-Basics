public class Parameterized {
    public static void main(String[] args) {
        Student s1 = new Student("Harshit");
        System.out.println(s1.name);
        
    }
    
    
}
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
