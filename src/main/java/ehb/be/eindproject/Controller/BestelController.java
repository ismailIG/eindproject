package ehb.be.eindproject.Controller;

import ehb.be.eindproject.Model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BestelController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = {"/bestel", "/Bestel"}, method = RequestMethod.POST)
    public String showBestel(ModelMap map) {
        return "bestel";
    }
}
