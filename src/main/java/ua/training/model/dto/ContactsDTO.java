
package ua.training.model.dto;

public class ContactsDTO {

    private String homePhone;
    private String mobilePhoneFirst;
    private String mobilePhoneSecond;
    private String email;
    private String skype;

    public ContactsDTO(String homePhone, String mobilePhoneFirst, String mobilePhoneSecond,
                          String email, String skype) {
        this.homePhone = homePhone;
        this.mobilePhoneFirst = mobilePhoneFirst;
        this.mobilePhoneSecond = mobilePhoneSecond;
        this.email = email;
        this.skype = skype;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhoneFirst() {
        return mobilePhoneFirst;
    }

    public void setMobilePhoneFirst(String mobilePhoneFirst) {
        this.mobilePhoneFirst = mobilePhoneFirst;
    }

    public String getMobilePhoneSecond() {
        return mobilePhoneSecond;
    }

    public void setMobilePhoneSecond(String mobilePhoneSecond) {
        this.mobilePhoneSecond = mobilePhoneSecond;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

}
