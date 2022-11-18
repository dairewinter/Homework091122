import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber.equals(passport.passportNumber) && surname.equals(passport.surname) && name.equals(passport.name) && Objects.equals(middleName, passport.middleName) && birthDate.equals(passport.birthDate);
    }


    @Override
    public int hashCode() {
        return Objects.hash(passportNumber, surname, name, middleName, birthDate);
    }
}
