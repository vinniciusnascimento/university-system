import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        University universidade = new University();
        Teacher professor1 = new Teacher();

        universidade.registerStudent("Vinnicius", 17);
        universidade.registerStudent("Victor", 11);
        universidade.registerTeacher("Giba", "Banco de Dados", BigDecimal.valueOf(2000));
        universidade.registerRoom(1,20);
        universidade.registerCourse("Java", 40, 1,1);

//        universidade.setStudentInCourse(1,1);
//        universidade.setStudentInCourse(2,1);

//        universidade.getInfos();
//        universidade.listAllStudentsInCourse(1,1);
//        universidade.infoCourse(1);
//        universidade.getStudentById(1);
    }
}