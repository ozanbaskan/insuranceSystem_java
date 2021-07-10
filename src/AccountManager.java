import java.util.TreeSet;

public class AccountManager {

    TreeSet<Account> accounts = new TreeSet<>();


    public void addAccount(Account account)
    {
        accounts.add(account);
    }

    public Account login(String email, String password)
    {
        for (Account a : this.accounts)
        {
            try
            {
                a.login(email,password);
                return a;
            }
            catch (Exception ignore) { }
        }
        return null;
    }






}
