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

    public Course(String name, double workLoad, String code) {
        this.name = name;
        this.workLoad = workLoad;
        this.code = code;
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
