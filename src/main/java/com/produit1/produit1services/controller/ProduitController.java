package com.produit1.produit1services.controller;

import com.produit1.produit1services.model.Produit;
import com.produit1.produit1services.service.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Produits")
@RequiredArgsConstructor
public class ProduitController {
    private final ProduitService ProduitService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/all")
    public List<Produit> getAllProduits(){
        return ProduitService.getAllProduits();
    }

    @PostMapping
    public Produit createProduit(@RequestBody Produit produit){
        return ProduitService.createProduit(produit);
    }
}
