package com.me.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.produits.entities.Produit;

public interface ProduitRepo extends JpaRepository<Produit, Long> {

}
