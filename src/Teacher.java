import java.math.BigDecimal;
import java.util.UUID;

public class Teacher {
    private int registration;
    private String name;
    private String specialty;
    private BigDecimal wage;

    public Teacher() {
    }

    public Teacher(String name, String specialty, BigDecimal wage) {
        this.name = name;
        this.specialty = specialty;
        this.wage = wage;
    }

    public Teacher(String name, String specialty, BigDecimal wage, int registration) {
        this(name, specialty, wage);
        this.registration = registration;
    }

    //    Getters and Setters
    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
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
