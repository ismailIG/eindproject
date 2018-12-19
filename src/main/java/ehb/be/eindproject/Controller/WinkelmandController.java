package ehb.be.eindproject.Controller;

import ehb.be.eindproject.Model.Product;
import ehb.be.eindproject.Model.ProductRepository;
import ehb.be.eindproject.Model.Winkelmand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WinkelmandController {
    @Autowired
    ProductRepository repo;
    public Iterable<Product> findAll() {

        return repo.findAll();
    }
    @RequestMapping(value ={"/bestel"},method = RequestMethod.GET)
    public String showIndex(ModelMap map){

       //Winkelmand.getInstance().getCart()

        return "bestel";}


}
