package br.com.oli33.core.banking.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oli33.core.banking.account.model.Account;
import br.com.oli33.core.banking.account.model.dto.AccountTransferObject;
import br.com.oli33.core.banking.account.service.IAccountService;


@RestController
@RequestMapping(value = "/api/accounts")
public class AccountController {

    @Autowired
    private IAccountService accountService;


    @PostMapping
    public Account register(final AccountTransferObject request){
        return this.accountService.register(request);
    }
    
    @GetMapping
    public List<Account> findAll() {
        return this.accountService.findAll();
    }
    
}
