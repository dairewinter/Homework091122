import java.util.*;

public class Recipe {
    private final HashSet<Product> products;
    private double totalCost;
    private final String name;

    public Recipe(HashSet<Product> products, String name) {
        this.products = products;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product){
        if (product == null){
            return;
        }
        if (this.products.contains(product)){
            throw new IllegalArgumentException("Продукт уже добавлен!");
        } else {
            this.products.add(product);
        }
    }

    public double getTotalCost() {
        double sum = 0;
        for(Product product : products){
            sum += product.getCost();
        }
        return sum;
    }

    public Set<Product> getProducts(){
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
