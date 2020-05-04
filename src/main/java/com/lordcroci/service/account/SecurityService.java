package com.lordcroci.service.account;

public interface SecurityService {
    String findLoggedInUsername();

    String getLoggerUserUsername();

    void autologin(String username, String password);
}
