import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        University universidade = new University();
        Teacher professor1 = new Teacher();

        universidade.registerStudent("Vinnicius", 17);
        universidade.registerTeacher("Giba", "Banco de Dados", BigDecimal.valueOf(2000));
        universidade.registerCourse("Java", 40);

        universidade.setStudentInCourse(1,1);

        universidade.getInfos();
    }
}