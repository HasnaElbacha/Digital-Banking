package ma.enset.digital_banking_backend.Services;

import ma.enset.digital_banking_backend.DTOs.*;
import ma.enset.digital_banking_backend.Entities.BankAccount;
import ma.enset.digital_banking_backend.Entities.CurrentAccount;
import ma.enset.digital_banking_backend.Entities.Customer;
import ma.enset.digital_banking_backend.Entities.SavingAccount;
import ma.enset.digital_banking_backend.Exeptions.BalanceNotSufficientException;
import ma.enset.digital_banking_backend.Exeptions.BankAccountNotFoundException;
import ma.enset.digital_banking_backend.Exeptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<Customer> listCustomers();
    List<BankAccountDTO> bankAccountList();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    List<AccountOperationDTO> accountHistory(String accountId);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;
}
