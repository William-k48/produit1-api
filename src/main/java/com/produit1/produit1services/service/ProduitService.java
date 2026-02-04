package com.produit1.produit1services.service;

import com.produit1.produit1services.model.Produit;
import com.produit1.produit1services.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProduitService {
    private final ProduitRepository ProduitRepository;

    public List<Produit> getAllProduits() {
        return ProduitRepository.findAll();
    }

    public Produit createProduit(Produit produit) {
        return ProduitRepository.save(produit);
    }
}
