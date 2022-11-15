import java.time.LocalDate;

public class Passport {
    private String passportNumber;
    private String surname;
    private String name;
    private final String middleName;
    private LocalDate birthDate;

    public Passport(String passportNumber, String surname, String name, String middleName, LocalDate birthDate) {
        this.passportNumber = passportNumber;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthDate = birthDate;
    }

    public Passport(String passportNumber, String surname, String name, LocalDate birthDate) {
        super();
        this.middleName = "отсутствует";
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Номер паспорта: " + getPassportNumber() + ", ФИО владельца: " + getSurname() + " " + getName() + " " + getMiddleName() + " " + getBirthDate();

    }
}
