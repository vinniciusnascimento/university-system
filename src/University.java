import java.math.BigDecimal;
import java.util.ArrayList;

public class University {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Room> rooms = new ArrayList<>();

    public void registerStudent(String name, int age){
        int register = students.size() + 1;
        Student student = new Student(name, age, register);
        students.add(student);
    }

    public void registerTeacher(String name, String especiality, BigDecimal wage){
        int register = teachers.size() + 1;
        Teacher teacher = new Teacher(name, especiality, wage, register);
        teachers.add(teacher);
    }

    public void registerCourse(String name, int workLoad){
        int register = courses.size() + 1;
        Course course = new Course(name,workLoad,register);
        courses.add(course);
    }

    public void getAllCourses(){
        for (Course course:courses){
            System.out.print(course.getName() + " - " + course.getCode() + " - " + course.getWorkLoad() + "h");
            System.out.println();
        }
    }

    public void getAllStudents(){
        for (Student student:students){
            System.out.print(student.getName() + " - " + student.getRegistration() + " - " + student.getCourse().getName());
            System.out.println();
        }
    }

    public void getAllTeachers(){
        for (Teacher teacher:teachers){
            System.out.print(teacher.getName() + " - " + teacher.getRegistration() + " - " + teacher.getSpecialty());
            System.out.println();
        }
    }

    public void setStudentInCourse(int idStudent, int idCourse){
        Student student = getStudentByIdReturn(idStudent);
        Course course = getCourseByIdReturn(idCourse);

        course.addStudent(student);
        student.setCourse(course);
        System.out.println("Adicionado com sucesso!");
    }

    public void getStudentById(int id){
        for (Student student:students){
            if (student.getRegistration() == id){
                student.infos();
            }
        }
    }

    public Student getStudentByIdReturn(int id){
        for (Student student:students){
            if (student.getRegistration() == id){
                return student;
            }
        }
        return null;
    }

    public Course getCourseByIdReturn(int code){
        for (Course course:courses){
            if (course.getCode() == code){
                return course;
            }
        }
        return null;
    }

    public void getInfos(){
        System.out.println("--- Cursos ---");
        this.getAllCourses();
        System.out.println();
        System.out.println("--- Alunos ---");
        this.getAllStudents();
        System.out.println();
        System.out.println("--- Teachers ---");
        getAllTeachers();
    }
}
