package com.example.JavaTestStefan.Service;

import com.example.JavaTestStefan.Repository.AccountRepository;
import model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MyService implements MyServiceInterface  {


    @Autowired
    private AccountRepository accountRepository;


    @Override
    public List<Account> findAll() {
        return (List<Account>)accountRepository.findAll();
    }

    @Override
    public int login(String username, String password) {
        return 0;
    }

    @Override
    public int logout(int sessionid) {
        return 0;
    }


    public String bulkcreate(){
// save a single Customer
        accountRepository.save(new Account("Rajesh", "Bhojwani"));
// save a list of Customers
        accountRepository.saveAll(Arrays.asList(new Account("Salim", "Khan")
                , new Account("Rajesh", "Parihar")
                , new Account("Rahul", "Dravid")
                , new Account("Dharmendra", "Bhojwani")));
        return "Customers are created";
    }
}
