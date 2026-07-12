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

    public void registerRoom(int block, int capacityMax){
        int number = rooms.size() + 1;
        Room room = new Room(number, block, capacityMax);
        rooms.add(room);
    }

    public void registerTeacher(String name, String especiality, BigDecimal wage){
        int register = teachers.size() + 1;
        Teacher teacher = new Teacher(name, especiality, wage, register);
        teachers.add(teacher);
    }

    public void registerCourse(String name, int workLoad, int teacherId, int roomId){
        int register = courses.size() + 1;

        Teacher teacher = this.getTeacherById(teacherId);
        Room room = this.getRoomById(roomId);
        Course course = new Course(name,workLoad,register, teacher, room);

        if (teacher == null || room == null) {
            System.out.println("Professor ou sala inválidos. Curso não criado.");
            return;
        }

        courses.add(course);
    }

    public void getAllCourses(){
        System.out.println("--- Get All Courses ---");
        for (Course course:courses){
            System.out.print(course.getName() + " - " + course.getCode() + " - " + course.getWorkLoad() + "h");
            System.out.println();
        }
    }

    public void getAllStudents(){
        for (Student student:students){
            System.out.println("--- Aluno: " + student.getName() + " ---");
            System.out.println(student.getName() + " - " + student.getRegistration());
            student.getCourse();
            System.out.println();
        }
    }

    public void getAllTeachers(){
        for (Teacher teacher:teachers){
            System.out.println("--- " + teacher.getName() + " ---");
            System.out.println(teacher.getName() + " - " + teacher.getRegistration());
            teacher.getCourses();
            System.out.println();
        }
    }

    public void setStudentInCourse(int idStudent, int idCourse){
        Student student = getStudentByIdReturn(idStudent);
        Course course = getCourseByIdReturn(idCourse);

        if (course.students.size() < course.getRoom().getCapacityMax()){
            for (Student student1 : course.students) {
                if (student1 == student){
                    System.out.println("Estudante já cadastrado nesse curso!");
                    return;
                }
            }
        } else{
            System.out.println("Capacidade máxima atingida");
            return;
        }

        course.addStudent(student);
        student.setCourse(course);
        System.out.println("Feito com sucesso!");
    }

    public void setTeacherInCourse(int idTeacher, int idCourse){
        Teacher teacher = getTeacherById(idTeacher);
        Course course = getCourseByIdReturn(idCourse);

        course.setTeacher(teacher);
        teacher.setCourses(course);
    }

    public void getStudentById(int id){
        for (Student student:students){
            if (student.getRegistration() == id){
                student.infos();
                return;
            }
        }
        System.out.println("Aluno não cadastrado!");
    }

    public Teacher getTeacherById(int id){
        for (Teacher teacher:teachers){
            if (teacher.getRegistration() == id){
                return teacher;
            }
        }
        return null;
    }

    public Room getRoomById(int id){
        for (Room room:rooms){
            if (room.getNumber() == id){
                return room;
            }
        }
        return null;
    }

    public Student getStudentByIdReturn(int id){
        for (Student student:students){
            if (student.getRegistration() == id){
                return student;
            }
        }
        return null;
    }

    private Course getCourseByIdReturn(int code){
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

    public void listAllStudentsInCourse(int idCourse){
        Course course = getCourseByIdReturn(idCourse);
        System.out.println("--- Alunos no Curso de " + course.getName() + " ---");

        course.getStudents();
    }

    public void infoCourse(int id){
        this.getCourseByIdReturn(id).infos();
    }
}
