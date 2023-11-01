package cart.product.ui.dto;

import cart.product.domain.Product;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ProductRequest {

    private final Long id;

    @NotEmpty(message = "이름은 필수 입력값 입니다.")
    private final String name;

    @NotNull(message = "가격은 필수 입력값 입니다.")
    private final BigDecimal price;

    @NotEmpty(message = "사진은 필수 입력값 입니다.")
    private final String imageUrl;

    public ProductRequest(Long id, String name, BigDecimal price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Product toDomain() {
        return new Product(null, name, imageUrl, price);
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

    @Override
    public String toString() {
        return "ProductRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
