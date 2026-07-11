import java.math.BigDecimal;
import java.util.UUID;

public class Teacher {
    private String registration;
    private String name;
    private String specialty;
    private BigDecimal wage;
    {
        setRegistration(UUID.randomUUID().toString());
    }

    public Teacher() {
    }

    public Teacher(String name, String specialty, BigDecimal wage) {
        this.name = name;
        this.specialty = specialty;
        this.wage = wage;
    }

    //    Getters and Setters
    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }
}
