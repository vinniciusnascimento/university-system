import java.util.ArrayList;

public class Student {
    private String name;
    private int registration;
    private int age;
    ArrayList<Course> courses = new ArrayList<>();

//    Constructors
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Course course) {
        this(name, age);
        this.setCourse(course);
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
        if (this.courses != null){
            System.out.println("Curso: ");
            this.getCourse();
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

    public void getCourse() {
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }

    public void setCourse(Course course) {
        courses.add(course);
    }
}
