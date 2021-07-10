import java.util.ArrayList;

public abstract class Account implements Comparable<Account> {

    private User user;
    ArrayList<Insurance> insurances = new ArrayList<>();
    private AuthenticationStatus login = AuthenticationStatus.FAIL;

    enum AuthenticationStatus
    {
        SUCCESS,
        FAIL
    }


    public final void showUserInfo()
    {
        System.out.println("Müşteri Bilgileri: ");
        System.out.println("İsim, soyisim: " + user.getName() + " " + user.getSurname());
        System.out.println("E-mail adresi: " + user.getEmail());
        System.out.println("Meslek: " + user.getOccupation());
        System.out.println("Yaş: " + user.getAge());
        System.out.println("Son giriş tarihi: " + user.getLastLogin());
        int addressCount = 1;

        for (Address a: user.getAddresses())
        {
           System.out.println(addressCount++ + ". adres:\n" + a.printAddress());
           System.out.println();
        }

    }

    public void login(String email, String password) throws InvalidAuthenticationException
    {
        if (email.equals(user.getEmail()) && password.equals(user.getPassword()))
        {
            this.login = AuthenticationStatus.SUCCESS;
            System.out.println("Giriş Başarılı!");
        }
        else
        {
            throw new InvalidAuthenticationException("Giriş Başarısız!");
        }
    }

    public void addAddress(Address address)
    {
        AddressManager.addAddress(address,this.user);
    }

    public void removeAddress(Address address)
    {
        AddressManager.removeAddress(address,this.user);
    }

    public boolean isLogin()
    {
        return login == AuthenticationStatus.SUCCESS;
    }

    public abstract void addInsurance(Insurance insurance);

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int compareTo(Account o) {
        return this.getUser().getLastLogin().compareTo(o.getUser().getLastLogin());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
