package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class customerDAO {
    List<customer> customers = new ArrayList<>();

    public boolean addCustomers(customer a, String firstName, String lastName, String email) {
        for (int i=0;i<customers.size();i++){
            String aEmail = customers.get(i).getEmail();
            if (email.equalsIgnoreCase(aEmail)){
                return false;
            }
        }
        customers.add(a);
        a.setFirstName(firstName);
        a.setLastname(lastName);
        a.setEmail(email);
        return true;
    }

    public String findCustomer(String firstName, String lastName){
        for (se.lexicon.customer customer : customers) {
            String aFirstName = customer.getFirstName();
            String aLastName = customer.getLastname();
            if (firstName.equalsIgnoreCase(aFirstName) || (lastName.equalsIgnoreCase(aLastName))) {
                return customer.getFirstName() + " " + customer.getLastname();
            }
        }
        return "";
    }
    public void removeCustomer(customer a){
        customers.remove(a);
    }
}
