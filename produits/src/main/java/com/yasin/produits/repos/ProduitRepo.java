package com.yasin.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yasin.produits.entities.Produit;

public interface ProduitRepo extends JpaRepository<Produit, Long> {

}
