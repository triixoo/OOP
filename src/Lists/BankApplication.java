package Lists;
import java.util.ArrayList;
import java.util.Comparator;
public class BankApplication {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public BankApplication(String name) {
        this.name = name;
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void removeAccount(int i) {
        if (i >= 0 && i < accounts.size()) {
            accounts.remove(i);
        }
    }

    public Account getMaxAccount() {
        return accounts.stream().max(Comparator.comparing(Account::getBalance)).orElse(null);
    }

    public double getAverageBalance() {
        return accounts.stream().mapToDouble(Account::getBalance).average().orElse(0);
    }

    public double getTotalBalance() {
        return accounts.stream().mapToDouble(Account::getBalance).sum();
    }

    public int totalAccounts() {
        return accounts.size();
    }

    public String getBankData() {
        return "Bank: " + name +
                ", Total Accounts: " + totalAccounts() +
                ", Total Balance: " + getTotalBalance() +
                ", Average Balance: " + getAverageBalance();
    }
}

