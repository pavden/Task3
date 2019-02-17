
package ua.training.model.entity;

public class AddressEntity {

    private String zipCode;
    private String city;
    private String street;
    private String building;
    private String apartment;
    private String fullAddress;

    public AddressEntity(String zipCode, String city, String street,
                         String building, String apartment) {
        this.zipCode = zipCode;
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartment = apartment;
        this.fullAddress = zipCode + ", " + city + ", " + street + " " + building + ", " + apartment;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("ZIP code = '").append(zipCode).append('\'');
        stringBuilder.append(", City = '").append(city).append('\'');
        stringBuilder.append(", Street = '").append(street).append('\'');
        stringBuilder.append(", Building = '").append(building).append('\'');
        stringBuilder.append(", Apartment = '").append(apartment).append('\'');
        stringBuilder.append(", Full address = '").append(fullAddress).append('\'');

        return stringBuilder.toString();
    }

}
