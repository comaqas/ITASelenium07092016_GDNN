package helper;

import java.util.UUID;

/**
 * Created by User on 7/25/2016.
 */
public class HelperRandomClass {

    public static String getRandomString() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(20);
    }

    public static String getRandomEmail() {
        return getRandomString() + "@mail.ru";
    }

    public static String getPassword() {
        return "P" + getRandomString();
    }

    public static String getUsername() {
        return getRandomString();
    }

    public static String getFirstName() {
        return getRandomString().substring(5);
    }

    public static String getLastName() {
        return getRandomString().substring(7);
    }
}
