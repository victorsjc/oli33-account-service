package br.com.oli33.core.banking.account.model;

/**
 * Esta classe representa a entidade Account
 * 
 */
public class Account {
    
    private String id;
    
    public Account(final String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }
}
