package ru.itpark.cashbackweb.service;

import org.springframework.stereotype.Service;

@Service
public class CashbackService {
    public int calculate(int amount){
        int percent = 5;
        int hunredPercent = 100;
        int result = amount * percent / hunredPercent;
        int limit = 3_000;
        if (result > limit){
           return limit;
        }
        return result;
    }
}
