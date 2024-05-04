package ma.enset.digital_banking_backend.Repositories;

import ma.enset.digital_banking_backend.Entities.BankAccount;
import ma.enset.digital_banking_backend.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
