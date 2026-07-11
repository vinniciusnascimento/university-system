import java.util.UUID;

public class Student {
    private String name;
    private int registration;
    private int age;
    private Course course;

//    Constructors
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Course course) {
        this(name, age);
        this.course = course;
    }

    public Student(String name, int age, int registration) {
        this(name, age);
        this.registration = registration;
    }

    //    Method
    public void infos(){
        System.out.println("--- Aluno ---");
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.println("Matrícula: " + this.registration);
        if (this.course != null){
            System.out.println("Curso: " + this.course.getName());
        }
    }

    //    Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
