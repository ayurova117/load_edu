package lesson1.orders;

public class Address
{
    private String country;
    private String city;
    private String street;
    private Integer numberOfHouse;
    private Integer numberOfFloor;
    private Integer numberOfFlat;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(Integer numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public Integer getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(Integer numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public Integer getNumberOfFlat() {
        return numberOfFlat;
    }

    public void setNumberOfFlat(Integer numberOfFlat) {
        this.numberOfFlat = numberOfFlat;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Address{");
        sb.append("country='").append(country).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", numberOfHouse=").append(numberOfHouse);
        sb.append(", numberOfFloor=").append(numberOfFloor);
        sb.append(", numberOfFlat=").append(numberOfFlat);
        sb.append('}');
        return sb.toString();
    }
}
