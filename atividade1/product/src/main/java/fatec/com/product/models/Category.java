package fatec.com.product.models;

import java.util.ArrayList;

public class Category {
    private Long id;
    private String name;

    
    private ArrayList<Product> products = new ArrayList<>();
    public Category() {
    }

    public Category(Long id, String name, String description) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Expondo produtos
    public ArrayList<Product> getProducts() {
        return products;
    }

    private void addProduct(Product product) {
        products.add(product);
    }
}
