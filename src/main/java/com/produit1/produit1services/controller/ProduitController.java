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



    @GetMapping("/all")
    public List<Produit> getAllProduits(){
        return ProduitService.getAllProduits();
    }

    @PostMapping
    public Produit createProduit(@RequestBody Produit produit){

        return ProduitService.createProduit(produit);
    }

    @GetMapping("{id}")
    public Produit getProduitById(@PathVariable long id){
        return ProduitService.getProduitById(id);
    }

    @DeleteMapping("{id}")
    public String deleteProduitById(@PathVariable("id")long idProduit){
        return ProduitService.deleteProduitById(idProduit);

    }

    @PutMapping("{id}")
    public Produit editProduit(@PathVariable long id, @RequestBody Produit produit){
        return ProduitService.editProduit(id,produit);
    }


}
