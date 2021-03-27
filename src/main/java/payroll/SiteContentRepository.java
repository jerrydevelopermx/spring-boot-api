package payroll;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteContentRepository  extends JpaRepository<SiteContent, Long> {
    SiteContent findBySectionIdAndPageId(String sectionId, Integer pageId);
}
