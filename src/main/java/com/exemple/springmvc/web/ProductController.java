package com.exemple.springmvc.web;


import com.exemple.springmvc.entities.Product;
import com.exemple.springmvc.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/index") // "Quand quelqu’un fait une requête GET sur cette URL, exécute cette méthode."
    public String index(Model model){
        List<Product> products = productRepository.findAll();
        model.addAttribute("productList", products);
        return "products"; // page products.html
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(name = "id") Long id){ // cherche dans les parmetre de l'URL un parametre qui s'appel id et et tu l'affect a la variable Long id
        productRepository.deleteById(id);
        return "redirect:/index";
    }

    @GetMapping("/newProduct")
    public String newProduct(Model model){
        model.addAttribute("product", new Product());
        return "new-product";
    }
    @PostMapping("/saveProduct")
    public String saveProduct(@Valid Product product, BindingResult bindingResult, Model model){ // apres save il fait la validation, s'il y a des erreurs il vas les stocker dans bindingResult, model pour stocker automatiquement
        if(bindingResult.hasErrors()) return "new-product";
        productRepository.save(product);
        return "redirect:/index";
    }
}
