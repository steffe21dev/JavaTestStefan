package com.example.JavaTestStefan.Service;

import model.Account;

import java.util.List;

public interface MyServiceInterface {

    List<Account> findAll();

    int login(String username, String password);

    int logout(int sessionid);
}
