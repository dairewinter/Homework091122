import java.util.ArrayList;
import java.util.Objects;

public class Product {
    private String name;
    private double cost;
    public int amount;
    private final boolean isBought;

    public Product(String name, double cost, int amount) {
        this.name = Validation.validName(name);
        this.cost = cost;
        this.amount = Validation.validAmount(amount);
        this.isBought = false;
    }


    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Продукт " + getName() + ", стоимость " + getCost() + ", количество " + getAmount();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.cost, cost) == 0 && amount == product.amount && isBought == product.isBought && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, amount, isBought);
    }
}
