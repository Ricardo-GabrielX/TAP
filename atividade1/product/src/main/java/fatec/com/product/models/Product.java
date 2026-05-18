package fatec.com.product.models;

public class Product {

    private Long id;
    private String name;
    private Double price;
    private String description;
    private Category category; // Isso faz o produto ter zero ou uma categoria.

    // private Category category = new Category() -> Isso obriga a produto ter 1 categoria, o que não é verdade, no nosso caso. Isso mudaria a representação do diagrama de classe

    public Product(){

    }

    public Product(Long id, String name, Double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
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
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    private void setCategory(Category category) {
        this.category = category;
    }
    
    
}