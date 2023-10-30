package cart.product.ui.dto;

import cart.product.domain.Product;

import java.math.BigDecimal;

public class ProductResponse {
    private final Long id;
    private final String name;
    private final String image;
    private final BigDecimal price;

    public ProductResponse(final Long id, final String name, final String image, final BigDecimal price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public static ProductResponse from(final Product product) {
        return new ProductResponse(product.getId(), product.getName(), product.getImage(), product.getPrice());
    }
}
