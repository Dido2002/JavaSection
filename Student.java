
public class Student {
    public String fn;
    public int age;
    public String name;
    public boolean hasStudentRights;

    public double[] grades;
    public Student(String fn, int age, int gradesCount){
        fn = fn;
        age = age;
        grades = new double[gradesCount];
    }
    public void printInfo(){
        System.out.println("Fn: "+ fn + " Name: " + name + " Age: " + age + " Rights: " + hasStudentRights);
    }
}
