package payroll;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
interface CampaignRepository extends JpaRepository<Campaign, Long> {
    List<Campaign> findByDepartmentID(Integer departmentID);
}


