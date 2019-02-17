
package ua.training.controller;

public interface Regex {

    String PROPER_NAME = "^[A-Za-z][A-Za-z'-]+([A-Za-z\\s][A-Za-z'-]+)*$";
    String NICKNAME = "^[\\w\\.-]{3,}$";
    String COMMENT = "^.{3,}$";
    String GROUP = "^(Family)|(Friends)|(Work)$";
    String PHONE = "\\+[1-9]\\d{6,14}$";
    String EMAIL = "^(\\w+@[A-Za-z_]+?\\.[A-Za-z]{2,6})$";
    String SKYPE = "^[A-Za-z][\\w\\.,-]{5,31}$";
    String ZIP_CODE = "^((\\d{5}-\\d{4})|(\\d{5,7}))$";
    String BUILDING = "^[1-9]\\d{0,2}([A-Za-z]?|(\\/[1-9]\\d{0,2})?)$";
    String APARTMENT = "^[1-9]\\d{0,2}$";

}
