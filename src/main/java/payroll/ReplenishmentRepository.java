package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ReplenishmentRepository extends JpaRepository<Replenishment, Long> {
    List<Replenishment> findByDepartmentID(Integer departmentID);
}
