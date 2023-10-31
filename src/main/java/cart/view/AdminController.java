package cart.view;

import cart.product.application.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    private final ProductService productService;

    public AdminController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/admin")
    public String viewAdmin(final Model model) {
        final var productResponses = productService.findAll();
        model.addAttribute("products", productResponses);
        return "admin";
    }
}
