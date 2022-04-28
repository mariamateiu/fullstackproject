package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import utility.ConnectionManager;

@Controller
public class HomeController {

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
    public String OpretØnskerliste(){

        return "OpretØnskerliste";
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




