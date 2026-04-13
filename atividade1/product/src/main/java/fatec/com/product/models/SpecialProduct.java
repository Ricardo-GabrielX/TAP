package fatec.com.product.models;

public class SpecialProduct extends Product {

    private String brand;
    private String model;

    public SpecialProduct() {
        super();
    }

    public SpecialProduct(Long id, String name, Double price, String description, String brand, String model) {
        super(id, name, price, description);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
