package cart.product.application;

import cart.product.infrastructure.ProductRepository;
import cart.product.ui.dto.ProductRequest;
import cart.product.ui.dto.ProductResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponse findById(final Long id) {
        final var product = productRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
        return ProductResponse.from(product);
    }

    public List<ProductResponse> findAll() {
        return productRepository.findAll().stream()
                .map(ProductResponse::from)
                .collect(Collectors.toList());
    }

    @Transactional
    public Long create(final ProductRequest productRequest) {
        final var product = productRepository.save(productRequest.toDomain());
        return product.getId();
    }

    @Transactional
    public Long update(final Long id, final ProductRequest productRequest) {
        final var product = productRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
        product.update(productRequest.getName(), productRequest.getImageUrl(), productRequest.getPrice());
        return product.getId();
    }

    @Transactional
    public void delete(final Long id) {
        productRepository.deleteById(id);
    }
}
