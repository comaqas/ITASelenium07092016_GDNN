package helpers;

import java.util.UUID;

public class RandomHelper {
    public static String getRandomString() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(15);
    }
}
