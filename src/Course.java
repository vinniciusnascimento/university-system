import java.util.UUID;

public class Course {
    private String name;
    private double workLoad;
    private String code;
    {
        setCode(UUID.randomUUID().toString());
    }

//    Constructors
    public Course() {
    }

//    Methods
    public void infos(){
        System.out.println("----- Infos curso " + this.name + " -----");
        System.out.println("Código: " + this.code);
        System.out.println("Carga horária: " + this.workLoad);
    }

    public Course(String name, double workLoad) {
        this.name = name;
        this.workLoad = workLoad;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
