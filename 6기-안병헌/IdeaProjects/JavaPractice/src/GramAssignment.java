class Teacher{
    public static void PrintHello(String Name){
        System.out.println("Hello " + Name);
    }

}

class Student1 extends Teacher{
    public static void StuInfo(String Name, int Number, int Class){
        System.out.println("My name is " + Name);
        System.out.println("My Number is " + Number);
        System.out.println("My Class is " + Class + "\n");
    }
    //Override
    public static void PrintHello(String Name){
        System.out.println("My Name is " + Name);
        System.out.println("Hello Teacher\n");
    }

}

class Student2 extends Teacher{
    public static void StuInfo(String Name, int Number, int Grade, int Class){
        System.out.println("My name is " + Name);
        System.out.println("My Number is " + Number);
        System.out.println(("My Grade is ") + Grade);
        System.out.println("My Class is " + Class + "\n");
    }
    public static void PrintHello(String Name){
        System.out.println("My Name is " + Name);
        System.out.println("Thank you Teahcer!\n");
    }
}
public class GramAssignment {
    public static void main(String[] args) {
        String Name = "Min Soo"; // student1 Name = Min soo
        Teacher.PrintHello(Name);

        Student1.PrintHello(Name);
        Student1.StuInfo(Name, 7, 2);

        Name = "Eun Soo";
        Teacher.PrintHello(Name);

        Student2.PrintHello(Name);
        Student2.StuInfo(Name, 14, 1, 1);
    }
}
