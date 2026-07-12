import java.util.ArrayList;

public class Course {
    private String name;
    private double workLoad;
    private int code;
    ArrayList<Student> students = new ArrayList<>();
    private Teacher teacher;
    private Room room;

//    Constructors
    public Course() {
    }

    public Course(String name, double workLoad) {
        this.name = name;
        this.workLoad = workLoad;
    }

    public Course(String name, double workLoad, int code) {
        this.name = name;
        this.workLoad = workLoad;
        this.code = code;
    }

    public Course(String name, double workLoad, int code, Teacher teacher, Room room) {
        this(name, workLoad, code);
        this.teacher = teacher;
        this.room = room;
    }

    //    Methods
    public void infos(){
        System.out.println("----- Infos curso " + this.name + " -----");
        System.out.println("Código: " + this.code);
        System.out.println("Carga horária: " + this.workLoad);
        System.out.println("Professor: " + this.teacher.getName());
        System.out.println("Sala: " + this.room.getNumber() + " - Bloco: " + this.room.getBlock());
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    //    Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(double workLoad) {
        this.workLoad = workLoad;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void printStudents() {
        for (Student student:students){
            System.out.println(student.getName());
        }
    }

    public ArrayList<Student> getStudentsReturn() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
