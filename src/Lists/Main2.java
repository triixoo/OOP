package Lists;
import java.util.ArrayList;
import java.util.Comparator;

public class Main2 {
        public static void main(String[] args) {
            ArrayList<BankApplication> allBanks = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                BankApplication bank = new BankApplication("Bank" + i);
                for (int j = 1; j <= 10; j++) {
                    Account account = new Account(j, "Name" + j, "Surname" + j, j * 100 * i);
                    bank.addAccount(account);
                }
                allBanks.add(bank);
            }
            allBanks.sort((bank1, bank2) -> Double.compare(bank2.getAverageBalance(), bank1.getAverageBalance()));
            for (BankApplication bank : allBanks) {
                System.out.println(bank.getBankData());
            }
        }
    }


