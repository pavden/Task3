
package ua.training.controller;

public interface Regex {

    String NAME = "^[A-Za-z][A-Za-z'-]+([A-Za-z\\s][A-Za-z'-]+)*$";
    String NICKNAME = "^[A-Za-z0-9]{3,}$";
    String COMMENT = "^\\w+$";
    String GROUP = "^(FAMILY)|(FRIENDS)|(WORK)$";
    String PHONE = "\\+\\d{12,15}$";
    String EMAIL = "\\w+@[A-Za-z_]+?\\.[A-Za-z]{2,6}";
    String SKYPE = "^[A-Za-z][A-Za-z\\d\\,\\-._]{6,32}$";
    String ZIP_CODE = "^\\d{5,7}$";
    String CITY = "^([A-Z]{1}[a-z]*)([\\s.-][A-Z]{1}[a-z]*)*$";
    String STREET = "^([A-Z]{1}[a-z]*)([\\s.-][A-Z]{1}[a-z]*)*$";
    String BUILDING = "^[1-9][0-9]{0,2}([A-Z]|[A-Za-z])?$";
    String APARTMENT = "^[1-9][0-9]{0,2}$";

}
