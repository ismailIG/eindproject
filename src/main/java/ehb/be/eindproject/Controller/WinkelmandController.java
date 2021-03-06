package ehb.be.eindproject.Controller;

import ehb.be.eindproject.Model.Product;
import ehb.be.eindproject.Model.ProductRepository;
import ehb.be.eindproject.Model.Winkelmand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WinkelmandController {
    @Autowired
    ProductRepository repo;

    public Iterable<Product> findAll() {

        return repo.findAll();
    }

    @RequestMapping(value = {"/winkelmand"}, method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        map.addAttribute("producten", Winkelmand.getInstance().getProducten());

        return "winkelmand";
    }

    @RequestMapping(value = {"/winkelmand"}, method = RequestMethod.POST)
    public String ToCart(ModelMap map, @RequestParam(value = "id") int id, @RequestParam(value = "amount") int aantal) {


        Product p = repo.findById(id).get();
        for (int i = 0; i < aantal; i++)
            Winkelmand.getInstance().addProducten(p);


        map.addAttribute("producten", Winkelmand.getInstance().getProducten());
        return "winkelmand";
    }


}
