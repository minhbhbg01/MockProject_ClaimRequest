package fa.edu.repository;

import fa.edu.entities.ClaimRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepository extends JpaRepository<ClaimRequest, Integer> {
}
