package org.myTest.utils;

public class UserDataFactory {

    public static UserData generateRandomUser() {
        String firstName = Utils.generateSecureRandomString(5);
        String lastName = Utils.generateSecureRandomString(5);
        String email = Utils.generateSecureRandomString(10) + "@gmail.com";
        String password = Utils.generateSecureRandomString(10, true);
        return new UserData(firstName, lastName, email, password);
    }
}
