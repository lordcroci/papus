package com.lordcroci.service.account;

public interface SecurityService {
    String findLoggedInUsername();

    String getLoggedUserUsername();

    void autologin(String username, String password);
}
