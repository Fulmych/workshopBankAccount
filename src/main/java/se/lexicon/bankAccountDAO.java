package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class bankAccountDAO {
    List<bankAccount> accounts = new ArrayList<>();
    public boolean addAccount(bankAccount a, String id, int balance, customer b){
        for (bankAccount account : accounts) {
            String aId = account.getId();
            if (aId.equalsIgnoreCase(id)) {
                return false;
            }
        }
        accounts.add(a);
        a.setId(id);
        a.setBalance(balance);
        a.setA(b);
        return true;
    }
    public String findAccount(String id){
        for (int i=0;i<accounts.size();i++){
            String aId = accounts.get(i).getId();
            if (id.equalsIgnoreCase(aId)){
                return accounts.get(i).getA().getFirstName() + " " + accounts.get(i).getA().getLastname() + " Id: " + accounts.get(i).getId();
            }
        }
        return "";
    }
    public void removeAccount(bankAccount a){
        accounts.remove(a);
    }
}
