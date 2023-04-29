package cart.domain;

import java.math.BigDecimal;

public class Product {

    private final Long id;
    private final Name name;
    private final String imageUrl;
    private final Price price;

    public Product(Long id, String name, String imageUrl, BigDecimal price) {
        this.id = id;
        this.name = new Name(name);
        this.imageUrl = imageUrl;
        this.price = new Price(price);
    }

    public Product(String name, String imageUrl, BigDecimal price) {
        this(null, name, imageUrl, price);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name.getName();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public BigDecimal getPrice() {
        return price.getAmount();
    }
}
