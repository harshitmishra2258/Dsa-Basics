public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Hrashit";
        s1.roll=35;
        s1.marks[0]=9;
        s1.marks[1]=9;
        s1.marks[2]=9;

        Student s2 = new Student(s1);
        s2.pass="hjhsdh";
        s1.marks[2]=0;
        System.out.println(s2.name);
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
            
        }
        
    }
    
}
class Student{
    String name ;
    int roll;
    String pass;
    int marks[];

    public Student() {
        marks = new int[3];
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }
    
    Student (Student s1){
        marks = new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;

    }
}
