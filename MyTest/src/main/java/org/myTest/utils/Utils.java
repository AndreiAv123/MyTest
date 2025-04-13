package org.myTest.utils;

import org.openqa.selenium.WebElement;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;


public class Utils {

    public static String generateSecureRandomString(int length) {
        return generateSecureRandomString(length, false);
    }

    public static String generateSecureRandomString(int length, boolean specialCharacters) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        if (specialCharacters) {

            characters = characters + "!@#$%^&*";
        }

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            sb.append(characters.charAt(randomIndex));
        }

        return sb.toString();
    }

    public static WebElement getRandomElementFromList(List<WebElement> elementList) {
        Random random = new Random();
        int randomElementIndex = random.nextInt(elementList.size());
        return elementList.get(randomElementIndex);
    }

    public static CharSequence getRandomInd(int maxValue) {
        Random random = new Random();
        String a = String.valueOf(random.nextInt(1, maxValue));
        System.out.println(a);
        return a;

    }
}