package br.edu.qi.pod.interdis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApresentacaoController {

    @RequestMapping(value={"/", "/home", "/index"})
    public String home(){
        return "home";
    }

}
