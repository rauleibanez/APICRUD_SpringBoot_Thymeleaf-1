package com.exp.ApiCRUD.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exp.ApiCRUD.InterfaceService.ILibroService;
import com.exp.ApiCRUD.Model.Libro;

@Controller
@RequestMapping
public class LibroController {

    @Autowired
    private ILibroService service;
    
    @GetMapping("/listar")
    public String listar(Model model){
        List<Libro>libros=service.listar();
        model.addAttribute("libros", libros);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("libro", new Libro());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated Libro l, Model model){
        service.save(l);
        return "redirect:/listar"; 
    }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Libro>libro=service.listarId(id);
        model.addAttribute("libro", libro);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id, Model model){
        service.delete(id);
        return "redirect:/listar";
    }
}
