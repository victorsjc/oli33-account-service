package br.com.oli33.core.banking.account.service;

import java.util.List;

import br.com.oli33.core.banking.account.model.Account;
import br.com.oli33.core.banking.account.model.dto.AccountTransferObject;

/**
 * 
 */
public interface IAccountService {

    /**
     * Responsável em registrar uma conta financeira
     * @param request requisição para registro de uma conta financeira
     * @return retorna um objeto <code>Account</code> representando os dados de uma conta financeira
     */
    public Account register(final AccountTransferObject request);
    
    /**
     * Responsável em consultar o registro de uma conta financeira
     * @param id Identificador da conta financeira
     * @return retorna o objeto <code>Account</code> encontrado, caso contrário retorna <code>null</code>
     */
    public Account findById(final String id);

    /**
     * Responsável em consultar todos os registros de uma conta financeira
     * @return retorna uma coleção de objetos <code>Account</code> representando as contas financeiras
     *         ordenados por data de cadastramento
     */
    public List<Account> findAll();
}
