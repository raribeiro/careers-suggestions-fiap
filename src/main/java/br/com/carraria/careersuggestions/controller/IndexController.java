package br.com.carraria.careersuggestions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping(value = "/")
    public String home(Model model){
        model.addAttribute("teste", "Valor resultado.");
        return "home/index";
    }
}
