package ehb.be.eindproject.Model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByDier(String welkDier);
    List<Product> findByCategorie(String welkeCategorie);

}
