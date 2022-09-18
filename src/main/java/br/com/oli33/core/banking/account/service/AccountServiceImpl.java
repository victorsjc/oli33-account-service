package br.com.oli33.core.banking.account.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import br.com.oli33.core.banking.account.model.Account;
import br.com.oli33.core.banking.account.model.dto.AccountTransferObject;

@Component
public class AccountServiceImpl implements IAccountService {

    /**
     * {@inheritDoc}
     */
    @Override
    public Account register(AccountTransferObject request) {
        return new Account(UUID.randomUUID().toString());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Account> findAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
