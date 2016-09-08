package helpers;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * Created by User on 8/29/2016.
 */
public class RandomHelper {
    public static String getRandomString() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(5);
    }
    public static String getRandomSubject(){
        return getRandomString()+"_"+new Date().toString().replaceAll(" ", "").replaceAll(":", "");
    }
    public static String getRandomEmail(){
        int lenght =8;
        String email = "Mail"+RandomStringUtils.randomNumeric(lenght) + "@gmail.com";
        return email;
    }

    public static String getFirstNameAndLastName(int length) {
            String alphabet =
                    new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
            int n = alphabet.length();
            String result = new String();
            Random r = new Random();
            for (int i = 0; i < length; i++)
                result = result + alphabet.charAt(r.nextInt(n));
            return result;
        }

    public static String getPassword(int length) {
        String alphabet =
                new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz12345678900987654321");
        int n = alphabet.length();
        String result = new String();
        Random r = new Random();
        for (int i = 0; i < length; i++)
            result = result + alphabet.charAt(r.nextInt(n));
        return result;
    }

    public static String  getDate(){
        Random rand = new Random();
        int value = rand.nextInt(30);
        String randomDay = String.valueOf(value);
        return randomDay;
    }
    public static String  getPhoneNumber(){
        Random rand = new Random();
        int value = rand.nextInt(1000000)+1230000000;
        String randomDay = String.valueOf(value);
        return randomDay;
    }
    public static String getPostCode(){
        Random rand = new Random();
        int value = rand.nextInt(100000);
        String randomDay = String.valueOf(value);
        return randomDay;
    }
    public static String getYear() {
        Random rand = new Random();
        int value = rand.nextInt(100) + 1910;
        String randomDay = String.valueOf(value);
        return randomDay;
    }
    public static String getMonth(){
            String[] Months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August",
                    "September", "October", "November", "December"};
            return Months[new Random().nextInt(11)];
        }

}
