package cart.product.ui.dto;

import cart.product.domain.Product;

import java.math.BigDecimal;

public class ProductResponse {

    private final Long id;
    private final String name;
    private final BigDecimal price;
    private final String imageUrl;

    public ProductResponse(final Long id, final String name, final BigDecimal price, final String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public static ProductResponse from(final Product product) {
        return new ProductResponse(product.getId(), product.getName(),product.getPrice(), product.getImageUrl());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
