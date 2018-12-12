package com.example.test1.demo.services;

import com.example.test1.demo.dao.models.Bank;
import com.example.test1.demo.dao.repository.BankRepository;
import com.example.test1.demo.dto.BankDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;

    public void addBank(BankDTO bankDTO) {
        Bank bank = new Bank();
        bank.setBname(bankDTO.getBname());
        bank.setBaccount(bankDTO.getBaccount());
        bank.setUname(bankDTO.getUname());
        bankRepository.save(bank);
        return;
    }
}
