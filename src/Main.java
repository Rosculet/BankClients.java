import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Account individualUser = new Individual("DE 1234 1234", 1200);
        individualUser.setRate(2);

        Account legalUser1 = new Legal("DE 1233 1222", 1000233);
        legalUser1.setRate(5);

        Account legalUser2 = new Legal("DE 1233 1222", 1002);
        legalUser2.setRate(5);

        VIP VIPuser = new VIP("DE 1233 1222", 100242);
        VIPuser.setRate(5);
        VIPuser.setBonus(100);

        List<Account> accounts = new ArrayList<>();
        accounts.add(individualUser);
        accounts.add(legalUser1);
        accounts.add(legalUser2);
        accounts.add(VIPuser);

        for (Account a : accounts) {
            a.calculationOfInterest();
        }











    }
}
