package guru.springframework.domain;

/**
 * Created by jt on 3/27/15.
 */
public class Product {
    private String description;

    public Product(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
