package payroll;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CampaignRepository extends JpaRepository<Campaign, Long> {
}


