package com.learn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AccountController {

    @Autowired
    private AccountClient accountClient;

    @GetMapping("/account")
    public void getAccount(@RequestParam(name = "id", defaultValue = "1") int id) {
//        return accountClient.getAccount(id);
        log.info(accountClient.getAccount(id).toString());
    }
}
