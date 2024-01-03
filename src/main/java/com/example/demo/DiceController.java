package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class DiceController {

    @GetMapping("/")
    public String rollDice(Model model) {
        int diceValue = new Random().nextInt(6) + 1;
        model.addAttribute("diceValue", diceValue);
        return "dice";
    }

}
