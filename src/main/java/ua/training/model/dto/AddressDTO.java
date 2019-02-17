
package ua.training.model.dto;

public class AddressDTO {

    private String zipCode;
    private String city;
    private String street;
    private String building;
    private String apartment;
    private String fullAddress;

    public AddressDTO(String zipCode, String city, String street,
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

}
