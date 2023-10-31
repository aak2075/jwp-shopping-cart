package cart.product.ui;

import cart.product.application.ProductService;
import cart.product.ui.dto.ProductRequest;
import cart.product.ui.dto.ProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(final ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/products/{productId}")
    public ResponseEntity<ProductResponse> readProduct(@PathVariable Long productId) {
        return ResponseEntity.ok(productService.findById(productId));
    }

    @GetMapping("/api/products")
    public ResponseEntity<List<ProductResponse>> readAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping("/api/products")
    public ResponseEntity<Void> createProduct(@RequestBody final ProductRequest productRequest) {
        final var createdId = productService.create(productRequest);
        return ResponseEntity.created(URI.create("/api/products/" + createdId)).build();
    }

    @PutMapping("/api/products/{productId}")
    public ResponseEntity<Void> updateProduct(@PathVariable final Long productId, @RequestBody final ProductRequest productRequest) {
        final var updatedId = productService.update(productId, productRequest);
        return ResponseEntity.created(URI.create("/api/products/" + updatedId)).build();
    }

    @DeleteMapping("/api/products/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable final Long productId) {
        productService.delete(productId);
        return ResponseEntity.ok().build();
    }
}
