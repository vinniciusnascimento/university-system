public class Main {
    public static void main(String[] args) {
        University universidade = new University();
        Teacher professor1 = new Teacher();
        Course curso1 = new Course("Java", 20);
//      Encontrar aluno pelo registro dando erro pois criar um aluno assim não faz ele ir para o array list.
        Student aluno = new Student("Vinnicius", 17, curso1);

        curso1.infos();
        aluno.infos();
    }
}