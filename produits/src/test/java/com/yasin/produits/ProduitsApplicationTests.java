package com.yasin.produits;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yasin.produits.entities.Produit;
import com.yasin.produits.repos.ProduitRepo;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepo productRepository;

	@Test
	public void testCreateProduct() {
	Produit prod = new Produit("Dell PC", 2200.500, "2024-06-01");
	productRepository.save(prod);
}

}
