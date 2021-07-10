public class HomeAddress implements Address{

    private String streetName;
    private String city;
    private String distinct;
    private String neighborhood;
    private int aptNumber;
    private int doorNumber;

    public HomeAddress(String streetName, String city, String distinct, String neighborhood, int aptNumber, int doorNumber) {
        this.streetName = streetName;
        this.city = city;
        this.distinct = distinct;
        this.neighborhood = neighborhood;
        this.aptNumber = aptNumber;
        this.doorNumber = doorNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistinct() {
        return distinct;
    }

    public void setDistinct(String distinct) {
        this.distinct = distinct;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(int aptNumber) {
        this.aptNumber = aptNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public String printAddress() {
        String s = "";
        s += "Mahalle: " + this.getNeighborhood() + ", Sokak: " + this.getStreetName();
        s += "\nApartman numarası: " + this.getAptNumber() + ", Kapı numarası: " + this.getDoorNumber();
        s += "\n" + this.getDistinct() + "/" + this.getCity();

        return s;
    }
}
