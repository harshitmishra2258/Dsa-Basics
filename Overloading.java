public class Overloading{
    public static void main(String args[]){
        Student s1 = new Student();
        System.out.println(s1.Percentage(45, 55));

    }
}
class Student {
    int Percentage(int a,int b ,int c){
        return (a+b+c)/3;
    }
    int Percentage(int a, int b){
        return (a+b)/2;
    }
}