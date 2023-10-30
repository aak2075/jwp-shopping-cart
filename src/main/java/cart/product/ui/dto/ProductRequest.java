package cart.product.ui.dto;

import cart.product.domain.Product;

import java.math.BigDecimal;

public class ProductRequest {

    private final String name;
    private final String image;
    private final BigDecimal price;

    public ProductRequest (final String name, final String image, final BigDecimal price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public Product toDomain() {
        return new Product(null, name, image, price);
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
