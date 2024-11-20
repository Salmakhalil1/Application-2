package org.sid.Bank_account_service.service;

import org.sid.Bank_account_service.dto.BankAccountRequestDTO;
import org.sid.Bank_account_service.dto.BankAccountResponseDTO;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountRequestDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
