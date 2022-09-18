package br.com.oli33.core.banking.account.model.dto;

public class AccountTransferObject {
    private String id;
    public AccountTransferObject(final String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }
}
