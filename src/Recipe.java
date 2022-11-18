import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<Product> products;
    private double totalCost;
    private String name;

    public Recipe(List<Product> products, double totalCost, String name) {
        this.products = products;
        this.totalCost = totalCost;
        this.name = name;
    }

    public double getTotalCost() {
        for (int i = 0; i < (products.size()+1); i++) {
            totalCost+= products.get(i).getCost();
        }
        return totalCost;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts(){
        return products;
    }




}
