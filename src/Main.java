import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        University universidade = new University();

        universidade.registerStudent("Vinnicius", 17);
        universidade.registerStudent("Victor", 11);
        universidade.registerStudent("Victor", 11);

        universidade.registerTeacher("Giba", "Banco de Dados", BigDecimal.valueOf(2000));
        universidade.registerRoom(1,2);
        universidade.registerRoom(2,2);
        universidade.registerCourse("Java", 40, 1,1);
        universidade.registerCourse("Python", 40, 1,2);

        universidade.getAllTeachers();
    }
}