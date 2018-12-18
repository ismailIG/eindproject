package ehb.be.eindproject.Controller;

import ehb.be.eindproject.Model.Product;
import ehb.be.eindproject.Model.ProductRepository;
import ehb.be.eindproject.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

    @Controller
    public class IndexController {
    @Autowired
    ProductRepository repo;
    @ModelAttribute("all")
    public Iterable<Product> findAll() {

        return repo.findAll();
    }
    @RequestMapping(value ={"/","/index"},method = RequestMethod.GET)
    public String showIndex(ModelMap map){return "index" ;}


}


