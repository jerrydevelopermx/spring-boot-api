package payroll;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProdSubcategoryRepository extends JpaRepository<ProdSubcategory, Long> {
    List<ProdSubcategory> findByProdCategoryCode(Integer prodCategoryCode);

}
