package com.mysite.controller;

import com.mysite.model.Product;
import com.mysite.repository.ProductRepository;
import com.mysite.service.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping ("/")
    public String viewHomePage(Model model){
        model.addAttribute("listProducts",productRepository.get4ByRandom());
        return "index";
    }
    @GetMapping("/wine-history")
    public String viewHistoryPage(){
        return "wine-history";
    }
    @GetMapping("/wine-shop")
    public String viewShopPage(Model model){
        List<Product> prod=productRepository.getAllByOrderByIdAsc();
        model.addAttribute("listProduct",prod);

        return "wine-shop";
    }
    @GetMapping("/wine-contacts")
    public String viewContactsPage(){
        return "wine-contacts";
    }
    @GetMapping("/wine/{id}")
    public String viewItemPage(@PathVariable(value = "id")Long id,Model model){
        Product product=productService.getProductById(id);

        model.addAttribute("listProducts",productRepository.get4ByRandom());
        model.addAttribute("item",product);

        return "wine";
    }

}
