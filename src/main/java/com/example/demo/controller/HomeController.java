package com.example.demo.controller;

import com.example.demo.Model.Ønsker;
import com.example.demo.Repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import utility.ConnectionManager;

@Controller
public class HomeController {

    ProductRepository pr = new ProductRepository();

    @GetMapping("/")
    public String vedikke(){
        ConnectionManager.connectionToDB();

        return "vedikke";
    }
    @GetMapping("/TilHam")
    public String TilHam(){

        return "TilHam";
    }
    @GetMapping("/TilHende")
    public String TilHende(){
        return "TilHende";
    }
    @GetMapping("/TilParret")
    public String TilParret(){

        return "TilParret";
    }
    @GetMapping("/TilBarnet")
    public String TilBarnet(){

        return "TilBarnet";
    }

    @GetMapping("/Oprettelse")
    public String Oprettelse(){

        return "Oprettelse";

    }
    @GetMapping("/OpretØnskeliste")
    public String OpretØnskeliste(){
        return "OpretØnskeliste";
    }


    @GetMapping("/Forside")
    public String Forside(){

        return "Forside";
    }


    @GetMapping("/login")
    public String loginSide(){
        return "EfterLogin";
    }

}




