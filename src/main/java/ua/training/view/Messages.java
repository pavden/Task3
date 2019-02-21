
package ua.training.view;

import java.util.Locale;
import java.util.ResourceBundle;

public interface Messages {

    String MESSAGES_BUNDLE_NAME = "messages";
    ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME,
                                                     //new Locale("en")); // English
                                                     new Locale("uk", "UA"));  // Ukrainian

    String WELCOME = bundle.getString("locale.welcome");
    String INPUT = bundle.getString("locale.input");
    String WRONG_INPUT = bundle.getString("locale.wrong.input");
    String LAST_NAME = bundle.getString("locale.last.name");
    String FIRST_NAME = bundle.getString("locale.first.name");
    String MIDDLE_NAME = bundle.getString("locale.middle.name");
    String NICKNAME = bundle.getString("locale.nickname");
    String COMMENT = bundle.getString("locale.comment");
    String GROUP = bundle.getString("locale.group");
    String HOME_PHONE = bundle.getString("locale.home.phone");
    String MOBILE_PHONE_FIRST = bundle.getString("locale.mobile.phone.first");
    String MOBILE_PHONE_SECOND = bundle.getString("locale.mobile.phone.second");
    String EMAIL = bundle.getString("locale.email");
    String SKYPE = bundle.getString("locale.skype");
    String ZIP_CODE = bundle.getString("locale.zip.code");
    String CITY = bundle.getString("locale.city");
    String STREET = bundle.getString("locale.street");
    String BUILDING = bundle.getString("locale.building");
    String APARTMENT = bundle.getString("locale.apartment");
    String SPACE = bundle.getString("locale.space");
    String COLON = bundle.getString("locale.colon");
    String NEW_LINE = bundle.getString("locale.new.line");

}
