
package ua.training.model.entity;

public class PersonEntity {

    private String lastName;
    private String firstName;
    private String middleName;
    private String fullName;

    public PersonEntity(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.fullName = lastName + " " + firstName.charAt(0) + ".";
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Last name = '").append(lastName).append('\'');
        stringBuilder.append(", First name = '").append(firstName).append('\'');
        stringBuilder.append(", Middle name = '").append(middleName).append('\'');
        stringBuilder.append(", Full name = '").append(fullName).append('\'');

        return stringBuilder.toString();
    }

}
