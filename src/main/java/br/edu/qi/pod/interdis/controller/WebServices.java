package br.edu.qi.pod.interdis.controller;

import br.edu.qi.pod.interdis.model.pojo.Deficiencia;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServices {

    @RequestMapping(value = "/deficiencias")
    public Iterable<Deficiencia> deficiencias(){
        return null;
    }

}
