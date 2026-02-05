package com.produit1.produit1services.service;

import com.produit1.produit1services.model.Produit;
import com.produit1.produit1services.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

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

    public Produit getProduitById(long id) {
        Optional<Produit> optionalProduit = ProduitRepository.findById(id);
        if (optionalProduit.isEmpty()){
            throw new RuntimeException("Desole produit inexistant");
        }
       return optionalProduit.get();
    }

    public String deleteProduitById(long idProduit) {
        Optional<Produit> optionalProduit = ProduitRepository.findById(idProduit);
        if (optionalProduit.isEmpty()) {
            throw new RuntimeException("Suppression impossible: PRODUIT INEXISTANT");
        }
        ProduitRepository.delete(optionalProduit.get());
        return "Produit supprimé avec succès !";
    }

    public Produit editProduit(long id, Produit produit) {
        Optional<Produit> optionalProduit = ProduitRepository.findById(id);

        if (optionalProduit.isEmpty()){
            throw new RuntimeException("Modification impossible");
        }
        Produit produitAModifier = optionalProduit.get();

        produitAModifier.setName(produit.getName());
        produitAModifier.setPrice(produit.getPrice());

        return ProduitRepository.save(produitAModifier);
    }
}
