package br.com.guilherme.cursomc.resourses;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaResourse {

    @RequestMapping(method = RequestMethod.GET)
    public String listar(){
        return "Rest esta funcionando!";
    }

}
