package se.lexicon;

public class main {
    public static void main(String[] args) {
        customerDAO collection = new customerDAO();
        customer b = new customer();
        customer c = new customer();
        bankAccountDAO bam = new bankAccountDAO();
        bankAccount a = new bankAccount();
        bankAccount l = new bankAccount();

        collection.addCustomers(b, "Bamse", "Långhus", "bamse.langhus");
        System.out.println(collection.findCustomer("Bamse", "Långhus"));
        bam.addAccount(a, "1654691", 2, b);
        System.out.println(bam.findAccount("Bamse", "Långhus"));
        System.out.println(bam.findAccountByCustomer(0));


        collection.addCustomers(c, "Lilleskutt", "Långhus", "lilleskutt.langhus");
        System.out.println(collection.findCustomer("Lilleskutt", "Långhus"));
        bam.addAccount(l, "2654696", 2, c);
        System.out.println(bam.findAccount("Lilleskutt", "Långhus"));
        System.out.println(bam.findAccountByCustomer(1));
    }
}
