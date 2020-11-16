package Repository;

import com.ipc.userservice.UserService.Entity.StudentPurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PurchaseRepository extends JpaRepository<StudentPurchaseEntity, Long> {
    List<StudentPurchaseEntity> findAllbySubject(String subject);

}
