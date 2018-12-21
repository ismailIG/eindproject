package ehb.be.eindproject.Controller;

import ehb.be.eindproject.Model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = {"/contact", "/Contact"}, method = RequestMethod.GET)
    public String showAbout(ModelMap map) {
        return "contact";
    }
}
