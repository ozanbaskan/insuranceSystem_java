import java.lang.reflect.Array;
import java.util.ArrayList;

public class AddressManager {



    public static void addAddress(Address address, User user)
    {
        ArrayList<Address> addresses = user.getAddresses();
        addresses.add(address);
        user.setAddresses(addresses);
    }

    public static void removeAddress(Address address, User user)
    {
        ArrayList<Address> addresses = user.getAddresses();
        addresses.removeIf(a -> address == a);
        user.setAddresses(addresses);
    }

}
