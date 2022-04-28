package com.example.demo.controller;

import com.example.demo.Model.Ønsker;
import com.example.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.utility.ConnectionManager;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

    ProductRepository productRepository;


    public HomeController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/" )
    public String vedikke(){
        //ConnectionManager.();

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

    @PostMapping("/OpretØnskeliste")
    public String opretØnske(@RequestParam("wish") String navn){
        Ønsker wish = new Ønsker();
        wish.setName(navn);

        productRepository.addWish(wish);
        System.out.println(wish);
        return "redirect:/";
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




