package ma.enset.digital_banking_backend.Repositories;

import ma.enset.digital_banking_backend.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
