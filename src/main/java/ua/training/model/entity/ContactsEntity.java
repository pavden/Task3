
package ua.training.model.entity;

public class ContactsEntity {

    private String homePhone;
    private String mobilePhoneFirst;
    private String mobilePhoneSecond;
    private String email;
    private String skype;

    public ContactsEntity(String homePhone, String mobilePhoneFirst, String mobilePhoneSecond,
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

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Home phone = '").append(homePhone).append('\'');
        stringBuilder.append(", Mobile phone (1) = '").append(mobilePhoneFirst).append('\'');
        stringBuilder.append(", Mobile phone (2) = '").append(mobilePhoneSecond).append('\'');
        stringBuilder.append(", Email = '").append(email).append('\'');
        stringBuilder.append(", Skype = '").append(skype).append('\'');

        return stringBuilder.toString();
    }

}
