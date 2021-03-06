package payroll;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteCMSRepository extends JpaRepository<SiteCMS, Long> {
    SiteCMS findBySiteID(Long siteID);

}
