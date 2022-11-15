public class Mechanic<M extends Car> {
    private final String name;
    private final String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public boolean maintenance(Car car){
        return car.passDiagnostics();
    }

    public void fixTheCar(){
        System.out.println("Механик чинит автомобиль");
    }

    @Override
    public String toString() {
        return "Механик " + getName() + " " + getSurname() + ", компания " + getCompany();
    }
}
