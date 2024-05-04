package ma.enset.digital_banking_backend.Repositories;

import ma.enset.digital_banking_backend.Entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {

}
