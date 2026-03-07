package com.exemple.springmvc.web;


import com.exemple.springmvc.entities.Product;
import com.exemple.springmvc.repository.ProductRepository;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/user/index") // "Quand quelqu’un fait une requête GET sur cette URL, exécute cette méthode."
    public String index(Model model, @RequestParam(name = "keyword", defaultValue = "") String keyword){
        List<Product> products;
        if (keyword.isEmpty()) {
            products = productRepository.findAll();
        } else {
            products = productRepository.findByNameContainingIgnoreCase(keyword);
        }
        model.addAttribute("productList", products);
        model.addAttribute("keyword", keyword);

        return "products"; // page products.html
    }

    @GetMapping("/")
    public String home(){
        return "redirect:/user/index";
    }

    @GetMapping("/admin/delete")
    public String delete(@RequestParam(name = "id") Long id){ // cherche dans les parmetre de l'URL un parametre qui s'appel id et et tu l'affect a la variable Long id
        productRepository.deleteById(id);
        return "redirect:/user/index";
    }

    @GetMapping("/admin/editProduct")
    public String editProduct(@RequestParam(name = "id") Long id, Model model){
        Product p = productRepository.findById(id).orElse(null);
        model.addAttribute("product", p);
        return "edit-product";
    }

    @PostMapping("/admin/saveEditedProduct")
    public String saveEditedProduct(Product product){
        productRepository.save(product);
        return "redirect:/user/index";
    }


    @GetMapping("/admin/newProduct")
    public String newProduct(Model model){
        model.addAttribute("product", new Product());
        return "new-product";
    }
    @PostMapping("/admin/saveProduct")
    public String saveProduct(@Valid Product product, BindingResult bindingResult, Model model){ // apres save il fait la validation, s'il y a des erreurs il vas les stocker dans bindingResult, model pour stocker automatiquement
        if(bindingResult.hasErrors()) return "new-product";
        productRepository.save(product);
        return "redirect:/user/index";
    }

    @GetMapping("/notAuthorized")
    public String notAuthorized(){
        return "notAuthorized";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }
}
