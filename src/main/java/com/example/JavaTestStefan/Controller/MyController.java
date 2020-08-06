package com.example.JavaTestStefan.Controller;

import com.example.JavaTestStefan.Exceptions.DataNotFoundException;
import com.example.JavaTestStefan.Repository.AccountRepository;
import com.example.JavaTestStefan.Service.MyService;
import model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RestController
public class MyController {

   @Autowired
   private AccountRepository accountRepository;


    // FIXME: 2020-08-06 Får ingen data från DBn
   //för testning
    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }


    // FIXME: 2020-08-06 404 error????
    @PostMapping("/login")
    public Account login(@RequestBody Map<String,String> data) throws DataNotFoundException
    {
        Account acc = accountRepository.findById(data.get("username")).orElseThrow(() -> new DataNotFoundException("Fel uppgifter"));



        return acc;

    }

    @PostMapping("/sidflesk")
    public String logout()
    {
        return "Ettan lös, extra god";
    }

    @GetMapping("/is-authenticated/{sessionId}")
    public void isAuth(@PathVariable String sessionId)
    {

    }


}


