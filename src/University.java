import java.math.BigDecimal;
import java.util.ArrayList;

public class University {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Room> rooms = new ArrayList<>();

    public void registerStudent(String name, int age){
        Student student = new Student(name, age);
        students.add(student);
    }

    public void registerTeacher(String name, String especiality, BigDecimal wage){
        Teacher teacher = new Teacher(name, especiality, wage);
        teachers.add(teacher);
    }

    public void registerRoom(int number, int block, int capacityMax){
        Room room = new Room(number, block, capacityMax);
        rooms.add(room);
    }

    public void registerCourse(String name, int workLoad){
        Course course = new Course(name,workLoad);
        courses.add(course);
    }

    public ArrayList<Student> getAllStudents(){
        return students;
    }

    public Student getStudent(String register) {
        for (Student student:students){
            if (student.getRegistration().equals(register)){
                return student;
            }
        }
        return null;
    }

    public ArrayList<Course> getAllCourses(){
        return courses;
    }
}
