package ru.itpark.cashbackweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.cashbackweb.service.CashbackService;

@Controller
public class CashbackController {
    public CashbackController(CashbackService cashbackService) {
        this.cashbackService = cashbackService;
    }

    private final CashbackService cashbackService;
    @GetMapping // привязка url к обработчику
    public String index(Model model){
        model.addAttribute("welcome", "Hello from Java");
        return "index";
    }

    @PostMapping // привязка url к обработчику
    public String index(Model model, @RequestParam int amount){
        model.addAttribute("welcome", "Hello from Java");

       model.addAttribute("cashback", cashbackService.calculate(amount));
       return "index";
    }
}
