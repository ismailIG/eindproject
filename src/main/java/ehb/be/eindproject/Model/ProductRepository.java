package ehb.be.eindproject.Model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    /*static List<Product> findByCat(String cat) {
    }*/

    List<Product> findByDier(String welkDier);

    List<Product> findByCategorie(String welkeCategorie);

}
