package ehb.be.eindproject.Controller;


import ehb.be.eindproject.Model.Product;
import ehb.be.eindproject.Model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DetailsController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = {"/details/{id}"}, method = RequestMethod.GET)
    public String showDetails(@PathVariable(name = "id") int identifier, ModelMap map) {

        Product detailProduct = productRepository.findById(identifier).get();
        map.addAttribute("product", detailProduct);

        return "details";
    }
}